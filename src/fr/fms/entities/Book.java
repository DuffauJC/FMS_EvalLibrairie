package fr.fms.entities;

public class Book {

	private int idBook;
	private String title;
	private double unitaryPrice;
	private String description;
	private String publishingHouse;
	private int qty=1;
	private String state;
	private String author;
	private int assocIdB;
	private int assocIdT;

	/**
	 * 
	 * @param idBook
	 * @param title
	 * @param unitaryPrice
	 * @param description
	 * @param publishingHouse
	 * @param state
	 * @param author
	 */
	public Book(int idBook, String title, double unitaryPrice, String description, String publishingHouse,
			String state,String author,int assocIdB, int assocIdT) {
			
		setIdBook(idBook);
		setTitle(title);
		setUnitaryPrice(unitaryPrice);
		setDescription(description);
		setPublishingHouse(publishingHouse);
		setQty(qty);
		setState(state);
		setAuthor(author);
		setAssocIdB(assocIdB);
		setAssocIdT(assocIdT);
	}
	public Book(int idBook, String title, double unitaryPrice, String description, String publishingHouse,
			String state,String author) {
			
		setIdBook(idBook);
		setTitle(title);
		setUnitaryPrice(unitaryPrice);
		setDescription(description);
		setPublishingHouse(publishingHouse);
		setQty(qty);
		setState(state);
		setAuthor(author);
	
	}
	/**
	 * 
	 * @param title
	 * @param unitaryPrice
	 * @param description
	 * @param publishingHouse
	 * @param state
	 * @param author
	 */
	public Book( String title, double unitaryPrice, String description, String publishingHouse,
			String state,String author,int assocIdB, int assocIdT) {

		setTitle(title);
		setUnitaryPrice(unitaryPrice);
		setDescription(description);
		setPublishingHouse(publishingHouse);
		setQty(qty);
		setState(state);
		setAuthor(author);
		setAssocIdB(assocIdB);
		setAssocIdT(assocIdT);
	}
	
	public Book( String title, double unitaryPrice, String description, String publishingHouse,
			String state,String author) {

		setTitle(title);
		setUnitaryPrice(unitaryPrice);
		setDescription(description);
		setPublishingHouse(publishingHouse);
		setQty(qty);
		setState(state);
		setAuthor(author);

	}

	/**
	 * @return the assocIdB
	 */
	public int getAssocIdB() {
		return assocIdB;
	}
	/**
	 * @param assocIdB the assocIdB to set
	 */
	public void setAssocIdB(int assocIdB) {
		this.assocIdB = assocIdB;
	}
	/**
	 * @return the assocIdT
	 */
	public int getAssocIdT() {
		return assocIdT;
	}
	/**
	 * @param assocIdT the assocIdT to set
	 */
	public void setAssocIdT(int assocIdT) {
		this.assocIdT = assocIdT;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the publishingHouse
	 */
	public String getPublishingHouse() {
		return publishingHouse;
	}
	/**
	 * @param publishingHouse the publishingHouse to set
	 */
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", title=" + title + ", unitaryPrice=" + unitaryPrice + ", description="
				+ description + ", publishingHouse=" + publishingHouse + ", qty=" + qty + ", state=" + state
				+ ", author=" + author + ", assocIdB=" + assocIdB + ", assocIdT=" + assocIdT + "]";
	}


}
