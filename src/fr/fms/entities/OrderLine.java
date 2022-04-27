package fr.fms.entities;

public class OrderLine {

	private int idOrderLine;
	private int idBook;
	private int quantity;
	private double unitaryPrice;
	private int idOrder;
	
	/**
	 * 
	 * @param idOrderLine
	 * @param idBook
	 * @param quantity
	 * @param unitaryPrice
	 * @param idOrder
	 */
	public OrderLine(int idOrderLine, int idBook, int quantity, double unitaryPrice, int idOrder) {
		setidOrderLine(idOrderLine);
		setidBook(idBook);
		setQuantity(quantity);
		setUnitaryPrice(unitaryPrice);
		setIdOrder(idOrder);

	}
	/**
	 * 
	 * @param idBook
	 * @param quantity
	 * @param unitaryPrice
	 * @param idOrder
	 */
	public OrderLine( int idBook, int quantity, double unitaryPrice, int idOrder) {

		setidBook(idBook);
		setQuantity(quantity);
		setUnitaryPrice(unitaryPrice);
		setIdOrder(idOrder);

	}

	public int getidOrderLine() {
		return idOrderLine;
	}

	public void setidOrderLine(int idOrderLine) {
		this.idOrderLine = idOrderLine;
	}

	public int getidBook() {
		return idBook;
	}

	public void setidBook(int idBook) {
		this.idBook = idBook;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitaryPrice() {
		return unitaryPrice;
	}

	public void setUnitaryPrice(double unitaryPrice) {
		this.unitaryPrice = unitaryPrice;
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	@Override
	public String toString() {
		return "OrderLine [idOrderLine=" + idOrderLine + ", idBook=" + idBook + ", quantity=" + quantity
				+ ", unitaryPrice=" + unitaryPrice + ", idOrder=" + idOrder + "]";
	}

}
