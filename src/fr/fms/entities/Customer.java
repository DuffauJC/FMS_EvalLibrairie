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

	
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [idCustomer=" + idCustomer + ", name=" + name + ", firstName=" + firstName + ", adress="
				+ adress + ", mail=" + mail + ", phone=" + phone + "]";
	}




	
}
