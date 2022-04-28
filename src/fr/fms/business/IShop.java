/**
 * 
 */
package fr.fms.business;

import java.util.ArrayList;

import fr.fms.entities.Book;



/**
 * @author Stagiaires08P
 *
 */
public interface IShop {

	/**
	 * ajoute un livre au panier
	 * @param book
	 */
	public void addCaddy(Book book);
	/**
	 * retourne un article du panier	
	 * @param id
	 * @return
	 */
	public Book readCaddy(int id);
	/**
	 * met à jour la quantitée d'un article du panier
	 * @param id
	 * @param qty
	 * @return
	 */
	public boolean updateCaddy(int id,int qty);
	/**
	 * supprime un article du panier
	 * @param id
	 * @return
	 */
	public boolean deleteCaddy(int id);
	/**
	 *  creation d'une commande 	
	 * @param idcustomer
	 * @return
	 */
	public int order(int idcustomer) ;
	/**
	 * retoune la liste du panier
	 * @return
	 */
	public ArrayList<Book> readCaddy();
	/**
	 * retourne la liste des livres d'une thematic
	 * @param id
	 * @return
	 */
	public  ArrayList<Book> getBooksByThematic(int id);
	
}
