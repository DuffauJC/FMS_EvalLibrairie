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

	public void addCaddy(Book book);				// ajoute un livre au panier	
	public Book readCaddy(int id);					// retourne un article du panier	
	public boolean updateCaddy(int id,int qty);			// met à jour la quantitée d'un article du panier
	public boolean deleteCaddy(int id);					// supprime un article du panier
	public int order(int idcustomer) ;					// pour creer une commande	
	public ArrayList<Book> readCaddy();              // retoune la liste du panier
	public  ArrayList<Book> getBooksByThematic(int id); // retourne la liste des livres d'une thematic
	
}
