package fr.fms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.fms.entities.Customer;

public class CustomerDao implements Dao<Customer> {

	@Override
	public boolean create(Customer obj) {
		String strSql="INSERT INTO customers (name, firstName,adress,mail,phone) VALUES(?,?,?,?,?);";	
		try(PreparedStatement ps =connection.prepareStatement(strSql)){ 
			ps.setString(1, obj.getName());
			ps.setString(2, obj.getFirstName());
			ps.setString(3, obj.getAdress());
			ps.setString(4, obj.getMail());
			ps.setInt(5,obj.getPhone());
			
			if (ps.executeUpdate()==1) {
				System.out.println("insertion ok");
				return true;
			}

		} catch (SQLException e) {
			System.out.println("creation : Erreur ");
		}
		return false;
		
	}

	@Override
	public Customer read(int id) {
		Customer cus = null;
		String strSql="SELECT * FROM customers WHERE id= ?;";		
		try(PreparedStatement ps =connection.prepareStatement(strSql)){ 
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();  
			while (rs.next()) {
				int rsidCustomer=rs.getInt(1);  
				String rsName =rs.getString(2);
				String rsfirstName=rs.getString(3);
				String rsAdress=rs.getString(4);
				String rsMail=rs.getString(5);
				int rsPhone=rs.getInt(6); 
				
				cus=new Customer(rsidCustomer,rsName,rsfirstName,rsAdress,rsMail,rsPhone);
				
			}

		} catch (SQLException e) {
			System.out.println("Lecture avec id : Erreur");
		}

		return cus;
	}

	@Override
	public boolean update(Customer obj) {
		return false;
	}

	@Override
	public boolean delete(int id)  {

		return false;
	}

	@Override
	public ArrayList<Customer> readAll()  {
		ArrayList<Customer> customers=new ArrayList<Customer>();
		String strSql="SELECT * FROM customers";						
		try(Statement statement =connection.createStatement()){
			try(ResultSet rs=statement.executeQuery(strSql)){  
				while (rs.next()) {
					int rsidCustomer=rs.getInt(1);  
					String rsName =rs.getString(2);
					String rsfirstName=rs.getString(3);
					String rsAdress=rs.getString(4);
					String rsMail=rs.getString(5);
					int rsPhone=rs.getInt(6); 
					
					customers.add((new Customer(rsidCustomer,rsName,rsfirstName,rsAdress,rsMail,rsPhone)));
				}
			}
		}
		catch (SQLException e) {
			System.out.println("Lecture table : Erreur");
		}

		return customers;
	}

	@Override
	public ArrayList<Customer> readByThematic(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
