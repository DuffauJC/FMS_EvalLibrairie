package fr.fms.entities;

public class Book {

	private int idBook;
	private String title;
	private double unitaryPrice;
	private String description;
	private String publishingHouse;

	private int qty=1;
	private int idThematic_1;
	private int idThematic_2;
	private int idThematic_3;
	private int idThematic_4;
	private String state;
	private String author;


	/**
	 * 
	 * @param idBook
	 * @param title
	 * @param unitaryPrice
	 * @param description
	 * @param publishingHouse
	 * @param idThematic_1
	 * @param idThematic_2
	 * @param idThematic_3
	 * @param idThematic_4
	 * @param state
	 * 
	 */
	public Book(int idBook, String title, double unitaryPrice, String description, String publishingHouse,
			int idThematic_1, int idThematic_2, int idThematic_3, int idThematic_4, String state,String author
			) {

		setIdBook(idBook);
		setTitle(title);
		setUnitaryPrice(unitaryPrice);
		setDescription(description);
		setPublishingHouse(publishingHouse);
		setQty(qty);
		setIdThematic_1(idThematic_1);
		setIdThematic_2(idThematic_2);
		setIdThematic_3(idThematic_3);
		setIdThematic_4(idThematic_4);
		setState(state);
setAuthor(author);
	}
	/**
	 * 
	 * @param idBook
	 * @param title
	 * @param unitaryPrice
	 * @param description
	 * @param publishingHouse
	 * @param state
	 */
	public Book(int idBook, String title, double unitaryPrice, String description, String publishingHouse,
			 String state,String author
			) {

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
	 * @param qty
	 * @param idThematic_1
	 * @param idThematic_2
	 * @param idThematic_3
	 * @param idThematic_4
	 * @param state
	 *
	 */
	public Book( String title, double unitaryPrice, String description, String publishingHouse,
			int idThematic_1, int idThematic_2, int idThematic_3, int idThematic_4, String state,String author
			) {

		setTitle(title);
		setUnitaryPrice(unitaryPrice);
		setDescription(description);
		setPublishingHouse(publishingHouse);
		setQty(qty);
		setIdThematic_1(idThematic_1);
		setIdThematic_2(idThematic_2);
		setIdThematic_3(idThematic_3);
		setIdThematic_4(idThematic_4);
		setState(state);
		setAuthor(author);
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
	 * @return the idThematic_1
	 */
	public int getIdThematic_1() {
		return idThematic_1;
	}
	/**
	 * @param idThematic_1 the idThematic_1 to set
	 */
	public void setIdThematic_1(int idThematic_1) {
		this.idThematic_1 = idThematic_1;
	}
	/**
	 * @return the idThematic_2
	 */
	public int getIdThematic_2() {
		return idThematic_2;
	}
	/**
	 * @param idThematic_2 the idThematic_2 to set
	 */
	public void setIdThematic_2(int idThematic_2) {
		this.idThematic_2 = idThematic_2;
	}
	/**
	 * @return the idThematic_3
	 */
	public int getIdThematic_3() {
		return idThematic_3;
	}
	/**
	 * @param idThematic_3 the idThematic_3 to set
	 */
	public void setIdThematic_3(int idThematic_3) {
		this.idThematic_3 = idThematic_3;
	}
	/**
	 * @return the idThematic_4
	 */
	public int getIdThematic_4() {
		return idThematic_4;
	}
	/**
	 * @param idThematic_4 the idThematic_4 to set
	 */
	public void setIdThematic_4(int idThematic_4) {
		this.idThematic_4 = idThematic_4;
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
				+ description + ", publishingHouse=" + publishingHouse + ", qty=" + qty + ", idThematic_1="
				+ idThematic_1 + ", idThematic_2=" + idThematic_2 + ", idThematic_3=" + idThematic_3 + ", idThematic_4="
				+ idThematic_4 + ", state=" + state + ", author=" + author + "]";
	}
}
