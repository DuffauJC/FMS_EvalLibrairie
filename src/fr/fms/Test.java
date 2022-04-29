package fr.fms;


import java.util.Date;

import fr.fms.business.IShopImpl;
import fr.fms.dao.BookDao;
import fr.fms.dao.OrderDao;
import fr.fms.dao.OrderLineDao;
import fr.fms.dao.ThematicDao;
import fr.fms.dao.CustomerDao;
import fr.fms.entities.Book;
import fr.fms.entities.Order;
import fr.fms.entities.OrderLine;
import fr.fms.entities.Thematic;
import fr.fms.entities.Customer;


public class Test {


	private static BookDao bookDao;	
	private static CustomerDao customerDao;
	private static OrderDao orderDao;
	private static OrderLineDao orderLineDao;
	private static ThematicDao thematicDao;
	
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {

		shopInit();

		// lecture de la table des livres
		
		/*
		 * System.out.println("Liste des livres : "); for(Book b : bookDao.readAll())
		 * System.out.println(b);
		 */
		 
		System.out.println("-------------------------------------------------------");

		// lecture d'un livre en fonction de son identifiant
		/*
		 * Book bk=bookDao.read(1); if (bk!=null) {
		 * System.out.println("Affichage du livre : "+bk.toString()); } else {
		 * System.out.println("Livre inexistant"); }
		 */
		 
		System.out.println("-------------------------------------------------------");

		// lecture de la table des thématics
		/*
		 * System.out.println("Liste des thématics : "); for(Thematic t :
		 * thematicDao.readAll()) System.out.println(t);
		 */
		System.out.println("-------------------------------------------------------");
	
		// lecture d'une thematique en fonction de son identifiant
		
		/*
		 * Thematic th=thematicDao.read(1); if (th!=null) {
		 * System.out.println("Affichage de la thématique : "+th.toString()); } else {
		 * System.out.println("Thématique inexistante"); }
		 */
		 
		 
		System.out.println("-------------------------------------------------------");

		// lecture des livres par thematique 
		
		/*
		 * System.out.println("Liste des livre par thématics : "); for(Book bk :
		 * bookDao.readByThematic(2)) System.out.println(bk);
		 */
		 
		 
		System.out.println("-------------------------------------------------------");
		
		
		
		///////////////////////////////////////////// Customer

		// enregistrment d'un customer
		//Customer cus=new Customer("Donald","Daisy28","17 rue de la pie qui chante" , "donald@gmail.com" );
		//customerDao.create(cus);

		// lecture de la table customers
		/*
		 * System.out.println("Liste des clients : "); for(Customer c :
		 * customerDao.readAll()) System.out.println(c);
		 */
		System.out.println("-------------------------------------------------------");

		// lecture d'un utilisateur en fonction de son identifiant
		/*
		 * Customer readCustomer=customerDao.read(3); if (readCustomer!=null) {
		 * System.out.println("Affichage du client' "+readCustomer.toString()); } else {
		 * System.out.println("Cleint inexistant"); }
		 */
		System.out.println("-------------------------------------------------------");
		
	
			
		
		

	}
	/**
	 * initialisation de la boutique
	 */
	private static void shopInit() {
		// TODO Auto-generated method stub
		bookDao= new BookDao();
		customerDao=new CustomerDao();
		orderDao=new OrderDao();
		orderLineDao=new OrderLineDao();
		thematicDao=new ThematicDao();
	}


}


