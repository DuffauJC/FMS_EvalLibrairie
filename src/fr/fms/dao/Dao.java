
package fr.fms.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * @author Stagiaires08P
 *
 */
public interface Dao<T> {
	
	/**
	 * création de la connexion
	 */
	public Connection connection=BddConnection.getConnection();
	
	public static final Logger logger = Logger.getLogger( "SqlExceptions" );
	/**
	 * methode de creation en base d'un objet passé en paramètre
	 * @param obj
	 * @return
	 */
	public  boolean create(T obj);
	/**
	 * lecture d'un objet en base suivant un identifiant
	 * @param id
	 * @return
	 */
	public  T read(int id);
	/**
	 * mise à jour d'un objet en base passé en paramètre
	 * @param obj
	 * @return
	 */
	public  boolean update(T obj);
	/**
	 * suppression d'un objet en base suivnat un identifiant
	 * @param id
	 * @return
	 */
	public  boolean delete(int id);
	/**
	 * lecture d'un table en base		
	 * @return
	 */
	public  ArrayList<T> readAll() ;
	/**
	 * lecture d'une selection suivant un identifiant
	 * @param id
	 * @return
	 */
	public ArrayList<T> readByThematic(int id); 
	
}
