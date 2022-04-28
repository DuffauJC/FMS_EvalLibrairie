package fr.fms.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.stream.Collectors;

import fr.fms.dao.DAOFactory;
import fr.fms.dao.Dao;
import fr.fms.entities.Book;
import fr.fms.entities.Thematic;
import fr.fms.entities.Order;
import fr.fms.entities.OrderLine;
import fr.fms.entities.Customer;

/**
 * @author Stagiaires08P
 *
 */
public class IShopImpl implements IShop {

	private HashMap<Integer,Book> caddy;
	private ArrayList<Book> caddyToList= null;

	private static Dao<Book> bookDao;
	private static Dao<Customer> customerDao;
	private static Dao<Thematic> thematicDao;
	private static Dao<Order> orderDao;
	private static Dao<OrderLine> orderLineDao;

	public IShopImpl() {
		caddy = new HashMap<Integer,Book>();	
		bookDao=DAOFactory.getBookDao();
		customerDao=DAOFactory.getCustomerDao();
		thematicDao=DAOFactory.getThematicDao();
		orderDao=DAOFactory.getOrderDao();
		orderLineDao=DAOFactory.getOrderLineDao();
	}

	 @Override
	public void addCaddy(Book book) {
		Book bk = caddy.get(book.getIdBook());
		if(bk!= null) {
			bk.setQty(bk.getQty() + 1);
		}
		else caddy.put(book.getIdBook(),book);
		

	}
	 @Override
	public Book readCaddy(int id)  {
		Book art = null;
		if (caddy.get(id)!=null) {
			art=caddy.get(id);
		} else {
			throw new RuntimeException("article inexistant dans le panier !");
		}

		return art;
	}

	 @Override
	public boolean updateCaddy(int id,int qty) {
		if (caddy.get(id)!=null) {
			caddy.get(id).setQty(qty);
		} else {
			throw new RuntimeException("article inexistant dans le panier !");
		}
		return true;	
	}

	
	 @Override
	public boolean deleteCaddy(int id)  {
		if (caddy.get(id)!=null) {
			caddy.remove(id);
		} else {
			throw new RuntimeException("article inexistant dans le panier !");
		}

		return true;
	}

	  @Override
	public int order(int idCustomer) {
		if(customerDao.read(idCustomer) != null) {
			double total = getTotal(); 
			Order order = new Order(total, new Date(), idCustomer);
			if(orderDao.create(order)) {	//ajout en base de la commande
				for(Book book : caddy.values()) {	//ajout des commandes minifiées associées
					orderLineDao.create(new OrderLine(book.getIdBook(), book.getQty(), book.getUnitaryPrice(), order.getIdOrder()));
				}
				return order.getIdOrder();
			}
		}
		
		return 0;
	}
	/**
	 * login customer
	 * @param mail
	 * @return
	 */
	public Customer login( String mail) {
		Customer cus = null;
		for (Customer c : getListCustomers()) {
			if (c.getMail().equalsIgnoreCase(mail)) {
				cus=new Customer(c.getIdCustomer(),c.getName(),c.getFirstName(),c.getAdress(),c.getMail(),c.getPhone());
			}
		}
		return cus;
	}


	 @Override
	public ArrayList<Book> readCaddy() {
		caddyToList = caddy.values().stream().collect(Collectors.toCollection(ArrayList::new));     
		return  caddyToList;
	}

	/**
	 * get customers
	 * @return
	 */
	public ArrayList<Customer> getListCustomers() {
		ArrayList<Customer> customers = customerDao.readAll();
		return customers;
	}

	/**
	 * get books
	 * @return
	 */
	public ArrayList<Book> getListABooks() {
		ArrayList<Book> books = bookDao.readAll();
		return books;
	}


	/**
	 * get thematics
	 * @return
	 */
	public ArrayList<Thematic> getListThematics() {
		ArrayList<Thematic> thematics = thematicDao.readAll();
		return thematics;
	}

	/**
	 * renvoi le total de la commande en cours
	 * @return total
	 */
	public double getTotal() {
		double [] total = {0};
		caddy.values().forEach((a) -> total[0] += a.getUnitaryPrice() * a.getQty()); 	
		return Math.floor(total[0]);
	}

	/**
	 * get book by id and add caddy
	 * @param id
	 */
	public void BookById(int id) {
		Book bk = null;
		bk=bookDao.read(id); 
		if (bk!=null) {
			addCaddy(bk);
		} else {
			throw new RuntimeException("livre inexistant dans la liste !");
		}

	}
	
	/**
	 * méthode pour vider le panier
	 */
	public void clearCart() {
		caddy.clear();		
	}

	/**
	 * get article by category
	 * @param id
	 * @return
	 */
	public  ArrayList<Book> getBooksByThematic(int id) {
		ArrayList<Book> books = null;
		if (thematicDao.read(id)!=null) {
			books=bookDao.readByThematic(id);

		} else {
			throw new RuntimeException("thematic inexistante dans la liste !");
		}

		return books;
	}
	/**
	 * création client
	 */
	public Customer createCustomer(Customer cus) {
		  if (customerDao.create(cus)) {
		Customer cust= login(cus.getMail());
			  return cust; 
			  }
		return null;	
	}

}
