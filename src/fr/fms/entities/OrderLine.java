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
		setIdOrderLine(idOrderLine);
		setIdBook(idBook);
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

		setIdBook(idBook);
		setQuantity(quantity);
		setUnitaryPrice(unitaryPrice);
		setIdOrder(idOrder);

	}



	/**
	 * @return the idOrderLine
	 */
	public int getIdOrderLine() {
		return idOrderLine;
	}
	/**
	 * @param idOrderLine the idOrderLine to set
	 */
	public void setIdOrderLine(int idOrderLine) {
		this.idOrderLine = idOrderLine;
	}
	/**
	 * @return the idBook
	 */
	public int getIdBook() {
		return idBook;
	}
	/**
	 * @param idBook the idBook to set
	 */
	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the unitaryPrice
	 */
	public double getUnitaryPrice() {
		return unitaryPrice;
	}
	/**
	 * @param unitaryPrice the unitaryPrice to set
	 */
	public void setUnitaryPrice(double unitaryPrice) {
		this.unitaryPrice = unitaryPrice;
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
	@Override
	public String toString() {
		return "OrderLine [idOrderLine=" + idOrderLine + ", idBook=" + idBook + ", quantity=" + quantity
				+ ", unitaryPrice=" + unitaryPrice + ", idOrder=" + idOrder + "]";
	}

}
