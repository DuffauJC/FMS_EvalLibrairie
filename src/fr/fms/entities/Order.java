package fr.fms.entities;

import java.util.Date;

public class Order {
	
	private int idOrder;
	private double amountTotal;
	private Date date;
	private int idCustomer;
	
	/**
	 * 
	 * @param idOrder
	 * @param amounTotal
	 * @param date
	 * @param idCustomer
	 */
	public Order(int idOrder, double amountTotal, Date date, int idCustomer) {
		setIdOrder(idOrder);
		setamountTotal(amountTotal);
		setDate(date);
		setidCustomer(idCustomer);
	
	}
	/**
	 * 
	 * @param amounTotal
	 * @param date
	 * @param idCustomer
	 */
	public Order(double amountTotal, Date date, int idCustomer) {
		setamountTotal(amountTotal);
		setDate(date);
		setidCustomer(idCustomer);
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public double getamountTotal() {
		return amountTotal;
	}

	public void setamountTotal(double amountTotal) {
		this.amountTotal = amountTotal;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getidCustomer() {
		return idCustomer;
	}

	public void setidCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	@Override
	public String toString() {
		return "Order [idOrder=" + idOrder + ", amountTotal=" + amountTotal + ", date=" + date + ", idCustomer="
				+ idCustomer + "]";
	}
	
}
