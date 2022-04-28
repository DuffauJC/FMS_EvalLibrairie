package fr.fms.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import fr.fms.entities.OrderLine;

public class OrderLineDao implements Dao<OrderLine> {

	@Override
	public boolean create(OrderLine obj) {
		String str = "INSERT INTO orderlines (IdBook, quantity, unitaryPrice, idOrder) VALUES (?,?,?,?);";	
		try (PreparedStatement ps = connection.prepareStatement(str)){	
			ps.setInt(1, obj.getIdBook());
			ps.setInt(2, obj.getQuantity());
			ps.setDouble(3, obj.getUnitaryPrice());
			ps.setInt(4, obj.getIdOrder());
			
			ps.executeUpdate();			
			return true;
		} catch (SQLException e) {
			//e.printStackTrace();
			logger.severe("pb Sql :" + e);
		}
		return false;
	}

	@Override
	public OrderLine read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(OrderLine obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<OrderLine> readAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ArrayList<OrderLine> readByThematic(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
