package fr.fms.dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import fr.fms.entities.Thematic;

public class ThematicDao implements Dao<Thematic> {


	@Override
	public boolean create(Thematic obj) {
		return false;
	}

	@Override
	public Thematic read(int id) {
		Thematic them = null;
		String strSql="SELECT * FROM thematics WHERE id = ?;";		
		try(PreparedStatement ps =connection.prepareStatement(strSql)){ 
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery(); 
			while (rs.next()) {
				int rsidThematic=rs.getInt(1);  
				String rsName=rs.getString(2);
				String rsDescription=rs.getString(3);
				
				them=new Thematic(rsidThematic,rsName,rsDescription);

			}

		} catch (SQLException e) {
			System.out.println("Lecture avec id : Erreur");
		}

		return them;
	}



	@Override
	public boolean update(Thematic obj){

		return false;
	}

	@Override
	public boolean delete(int id) {

		return false;
	}

	@Override
	public ArrayList<Thematic> readAll() {
		ArrayList<Thematic>thematics=new ArrayList<Thematic>();
		String strSql="SELECT * FROM thematics";						
		try(Statement statement =connection.createStatement()){
			try(ResultSet rs=statement.executeQuery(strSql)){  
				while (rs.next()) {
					int rsidThematic=rs.getInt(1);  
					String rsName=rs.getString(2);
					String rsDescription=rs.getString(3);
			
					thematics.add((new Thematic(rsidThematic,rsName,rsDescription)));
				}
			}
		}
		catch (SQLException e) {
			System.out.println("Lecture table : Erreur");
		}

		return thematics;
	}

	@Override
	public ArrayList<Thematic> readByThematic(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
