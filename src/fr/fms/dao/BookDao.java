package fr.fms.dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.fms.entities.Book;

public class BookDao implements Dao<Book> {

	@Override
	public boolean create(Book obj) {

		return false;
	}

	@Override
	public Book read(int id) {
		Book book = null;
		String strSql="SELECT * FROM books WHERE id =?;";		
		try(PreparedStatement ps =connection.prepareStatement(strSql)){ 
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery(); 
			while (rs.next()) {
				int rsidBook=rs.getInt(1);  
				String rsTitle=rs.getString(2);
				double rsunitaryPrice=rs.getDouble(3);
				String rsDescription=rs.getString(4);
				String rsPubH=rs.getString(5);
				String rsState=rs.getString(6);
				String rsAuthor=rs.getString(7);
				book=new Book(rsidBook,rsTitle,rsunitaryPrice,rsDescription,rsPubH,rsState,rsAuthor);
				
			
			}

		} catch (SQLException e) {
			System.out.println("Lecture avec id : Erreur");
		}

		return book;
	}



	@Override
	public boolean update(Book obj){

		return false;
	}

	@Override
	public boolean delete(int id) {

		return false;
	}

	@Override
	public ArrayList<Book> readAll() {
		ArrayList<Book> books=new ArrayList<Book>();
		String strSql="SELECT * FROM books";						
		try(Statement statement =connection.createStatement()){
			try(ResultSet rs=statement.executeQuery(strSql)){  
				while (rs.next()) {
					int rsidBook=rs.getInt(1);  
					String rsTitle=rs.getString(2);
					double rsunitaryPrice=rs.getDouble(3);
					String rsDescription=rs.getString(4);
					String rsPubH=rs.getString(5);
					String rsState=rs.getString(6);
					String rsAuthor=rs.getString(7);
					books.add((new Book(rsidBook,rsTitle,rsunitaryPrice,rsDescription,rsPubH,rsState,rsAuthor)));
				}
			}
		}
		catch (SQLException e) {
			System.out.println("Lecture table : Erreur");
		}

		return books;
	}
	@Override
	public ArrayList<Book> readByThematic(int id) {
		ArrayList<Book> books=new ArrayList<Book>();
		String strSql="SELECT * FROM books inner join assoc_books_thematics WHERE books.id = assoc_books_thematics.idBook and assoc_books_thematics.idThematic= ?";
				
		
		try(PreparedStatement ps =connection.prepareStatement(strSql)){ 
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery(); 
			while (rs.next()) {
				int rsidBook=rs.getInt(1);  
				String rsTitle=rs.getString(2);
				double rsunitaryPrice=rs.getDouble(3);
				String rsDescription=rs.getString(4);
				String rsPubH=rs.getString(5);
				String rsState=rs.getString(6);
				String rsAuthor=rs.getString(7);
				int rsassocIdB=rs.getInt(8);  
				int rsassocIdT=rs.getInt(9);  
				
				books.add((new Book(rsidBook,rsTitle,rsunitaryPrice,rsDescription,rsPubH,rsState,rsAuthor, rsassocIdB,rsassocIdT)));

			}

		} catch (SQLException e) {
			System.out.println("readByThematic : Erreur");
		}

		return books;
	}


}
