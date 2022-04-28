package fr.fms.entities;

public class Customer {

	private int idCustomer;
	private String name;
	private String firstName;
	private String adress;
	private String mail;
	private int phone;
	/**
	 * 
	 * @param idCustomer
	 * @param name
	 * @param firstName
	 * @param adress
	 * @param mail
	 * @param phone
	 */
	public Customer(int idCustomer, String name, String firstName, String adress, String mail, int phone) {
		
		setIdCustomer(idCustomer);
		setName(name);
		setFirstName(firstName);
		setAdress(adress);
		setMail(mail);
		setPhone(phone);
	
	}
	/**
	 * 
	 * @param name
	 * @param firstName
	 * @param adress
	 * @param mail
	 * @param phone
	 */
	public Customer( String name, String firstName, String adress, String mail, int phone) {
		
		setName(name);
		setFirstName(firstName);
		setAdress(adress);
		setMail(mail);
		setPhone(phone);
	
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
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}
	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [idCustomer=" + idCustomer + ", name=" + name + ", firstName=" + firstName + ", adress="
				+ adress + ", mail=" + mail + ", phone=" + phone + "]";
	}

}
