package fr.fms.dao;

import fr.fms.entities.Book;
import fr.fms.entities.Thematic;
import fr.fms.entities.Order;
import fr.fms.entities.OrderLine;
import fr.fms.entities.Customer;

public class DAOFactory {

	// méthodes qui retournent des instances pour effectuer les méthodes de CRUD
	
	public static Dao<Book> getBookDao() {
		return new BookDao();
	}
	
	public static Dao<Customer> getCustomerDao() {
		return new CustomerDao();
	}
	
	public static Dao<Thematic> getThematicDao() {
		return new ThematicDao();
	}
	
	public static Dao<Order> getOrderDao() {
 		return new OrderDao();
 	}
 	
 	public static Dao<OrderLine> getOrderLineDao() {
 		return new OrderLineDao();
 	}

}
