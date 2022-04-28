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
		setAmountTotal(amountTotal);
		setDate(date);
		setIdCustomer(idCustomer);
	
	}
	/**
	 * 
	 * @param amounTotal
	 * @param date
	 * @param idCustomer
	 */
	public Order(double amountTotal, Date date, int idCustomer) {
		setAmountTotal(amountTotal);
		setDate(date);
		setIdCustomer(idCustomer);
	}

	/**
	 * @return the idOrder
	 */
	public int getIdOrder() {
		return idOrder;
	}
	/**
	 * @param idOrder the idOrder to set
	 */
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	/**
	 * @return the amountTotal
	 */
	public double getAmountTotal() {
		return amountTotal;
	}
	/**
	 * @param amountTotal the amountTotal to set
	 */
	public void setAmountTotal(double amountTotal) {
		this.amountTotal = amountTotal;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the idCustomer
	 */
	public int getIdCustomer() {
		return idCustomer;
	}
	/**
	 * @param idCustomer the idCustomer to set
	 */
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	@Override
	public String toString() {
		return "Order [idOrder=" + idOrder + ", amountTotal=" + amountTotal + ", date=" + date + ", idCustomer="
				+ idCustomer + "]";
	}
	
}
