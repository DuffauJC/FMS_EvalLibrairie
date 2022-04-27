
package fr.fms.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * @author Stagiaires08P
 *
 */
public interface Dao<T> {
	
	
	public Connection connection=BddConnection.getConnection();  // création de la connexion
	public static final Logger logger = Logger.getLogger( "SqlExceptions" );
	
	public  boolean create(T obj);        //methode de creation en base d'un objet passé en paramètre
	public  T read(int id);			      // lecture d'un objet en base suivant un identifiant
	public  boolean update(T obj);        // mise à jour d'un objet en base passé en paramètre
	public  boolean delete(int id);       // suppression d'un objet en base suivnat un identifiant
	public  ArrayList<T> readAll() ;	  // lecture d'un table en base		 
	public ArrayList<T> readByThematic(int id);	// lecture d'une selection suivant un identifiant
	
}
