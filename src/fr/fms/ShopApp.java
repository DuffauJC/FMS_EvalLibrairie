package fr.fms;

import java.util.ArrayList;
import java.util.Scanner;
import fr.fms.business.IShopImpl;
import fr.fms.entities.Book;
import fr.fms.entities.Thematic;
import fr.fms.entities.Customer;

public class ShopApp {

	private static Scanner scan = new Scanner(System.in); 
	private static IShopImpl shopJob;	
	private static String mail = "";

	private static Customer userOk=null;

	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {

		// initialisation
		shopJob = new IShopImpl();

		welcome();

		while (true) {
			showBooks();
			showThematics();
			mainFunction();

		}

	}


	/**
	 * principal function
	 */
	public static void mainFunction() {

		int action=0;
		int index;

		while(action != 5) {
			try {

				showMenu();

				action = scan.nextInt();

				switch(action) {
				case 1 : // add to caddy

					// thématic choose
					System.out.println("Choose the thématic.");
					while(!scan.hasNextInt()) {
						System.out.println("The entered value is incorrect, enter a new entry.");
						scan.next();
					}
					index =scan.nextInt();

					// list of books of the chosen thématic and add to caddy
					showChoosenThematic(index);

					break;

				case 2 : // show caddy
					caddy();

					break;

				case 3 : // update caddy
					displayCaddy();

					break;

				case 4 : // validate basket

					System.out.println("Type your mail to valid order"); 
					while(!scan.hasNext()) {
						System.out.println("The entered value is incorrect, enter a new entry.");
						scan.next();
					}

					mail=scan.next(); 

					//Check if the account exists. 
					userOk= shopJob.login(mail);

					if (userOk!=null) { 
						displayCommand(userOk);
					} else {
						System.out.println("Non-existent customer, input error ?.");
						System.out.println("Type your mail to valid order"); 
						mail=scan.next(); 
						//Check if the account exists. 
						userOk= shopJob.login(mail);

						if (userOk!=null) {
							displayCommand(userOk);

						}else {
							System.out.println("register to order.");
							register();	
						}

					}

					break;

				case 5 : // Exit account
					System.out.println("Exit shop.");
					break;

				default : System.out.println(" Wrong entry, your choice: "+action+" does not exist in the menu");

				}	

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}
	/**
	 * welcome message poster
	 */
	private static void welcome() {
		System.out.println();
		System.out.println("********************************************");
		System.out.println("   BIENVENUE CHEZ LA LIBRAIRIE DU CAHIER");
		System.out.println("********************************************");		
		System.out.println();
	}
	/**
	 * menu poster
	 */
	public static  void showMenu() {
		System.out.println("*******************************************************************************************");
		System.out.println("MENU");
		System.out.print("1.Ajouter au panier - ");
		System.out.print("2.Voir le panier - ");
		System.out.print("3.Modifier panier - ");
		System.out.print("4.Valider commande - ");
		System.out.print("5.Sortir \n");
		System.out.println("********************************************************************************************");
	}
	/**
	 * books poster
	 */
	public static  void showBooks() {

		// list of book thematic
		ArrayList<Book>book=shopJob.getListABooks();

		System.out.println("List of books.\n");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-5s| %-43s | %-78s | %-20s | %-22s | %-10s | %-10s |%n", "NO.","TITRE", "DESCRIPTION", "MAISON EDITION","AUTEUR", " PRIX","ETAT");
		System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");

		for (int i = 0; i < book.size(); i++) {
			System.out.printf("| %-5s| %-43s | %-78s | %-20s | %-22s | %-10s | %-10s |%n",book.get(i).getIdBook(),book.get(i).getTitle(), 
					book.get(i).getDescription(),book.get(i).getPublishingHouse(),
					book.get(i).getAuthor(),book.get(i).getUnitaryPrice(),book.get(i).getState());
		}	
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		book.clear();

	}
	/**
	 * thematics poster
	 */
	public static  void showThematics() {

		// list of book thematic
		ArrayList<Thematic>cat=	shopJob.getListThematics();

		System.out.println("List of thématics.\n");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-5s | %-22s | %-68s |%n", "REF", "NOM", "DESCRIPTION");
		System.out.println("|---------------------------------------------------------------------------------------------------------------|");

		for (int i = 0; i < cat.size(); i++) {
			System.out.printf("| %-5s | %-22s | %-68s |%n", cat.get(i).getIdThematic(), cat.get(i).getName(),
					cat.get(i).getDescription());
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		cat.clear();

	}
	/**
	 * enregistremnt client
	 */
	private static void register() {
		String regExp="[a-zA-Z]+";

		String rep;

		String name=""; 
		String firstName="";
		String adress="";
		String mail="";
		int phone=0;

		System.out.println("Enter your name."); 
		rep=scan.next();
		if (rep.matches(regExp)) {
			name=rep;
		}
		System.out.println("Enter your firstname.");
		rep=scan.next();
		if (rep.matches(regExp)) {
			firstName=rep;
		}
		System.out.println("Enter your adress.");
		scan.nextLine();
		adress= scan.nextLine();
		System.out.println("Enter your mail.");
		mail=scan.next();
		System.out.println("Enter your phone number.");
		phone=scan.nextInt();

		// enregistrment d'un customer
		Customer cus=shopJob.createCustomer(new Customer(name,firstName,adress,mail,phone));

		if (cus!=null) { 
			displayCommand(cus); 
		} else {
			System.out.println("soucis création de compte.");
		}

	}
	/**
	 * affichage livres en fonction de la thématique choisie
	 * @param index
	 */
	private static void showChoosenThematic(int index) {

		ArrayList<Book> book=shopJob.getBooksByThematic(index);
		if (book.isEmpty()) {
			System.out.println("Aucun livre dans cette thématique.");
		} else {
			System.out.println("List of books in the thématic "+index+" : ");

			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("| %-5s| %-43s | %-78s | %-20s | %-22s | %-10s | %-10s |%n", "NO.","TITRE", "DESCRIPTION", "MAISON EDITION","AUTEUR", " PRIX","ETAT");
			System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");

			for (int i = 0; i < book.size(); i++) {
				System.out.printf("| %-5s| %-43s | %-78s | %-20s | %-22s | %-10s | %-10s |%n",book.get(i).getIdBook(),book.get(i).getTitle(), 
						book.get(i).getDescription(),book.get(i).getPublishingHouse(),
						book.get(i).getAuthor(),book.get(i).getUnitaryPrice(),book.get(i).getState());
			}	
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Type the reference to add.");

			while(!scan.hasNextInt()) {
				System.out.println("The entered value is incorrect, enter a new entry.");
				scan.next();
			}

			index =scan.nextInt();

			// read an article according to its identifier
			// if returned add to cart in business layer
			shopJob.BookById(index);
			book.clear();
		}

	}

	/**
	 * show caddy
	 */
	private static void caddy() {

		ArrayList<Book> caddy=shopJob.readCaddy();

		if (caddy.isEmpty()) {
			System.out.println("---------------------");
			System.out.println("Votre panier est vide");
			System.out.println("---------------------");
		} else {
			System.out.println("Caddy\n");
			System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.printf("| %-5s| %-35s | %-30s | %-20s |%-3s |%n", "NO.", "TITRE", "AUTEUR", " PRIX"," QTE");
			System.out.println("|------|---------------------------------------------------------------------------------------------------|");

			for (int i = 0; i < caddy.size(); i++) {
				System.out.printf("| %-5s| %-35s | %-30s | %-20s | %-3s |%n",caddy.get(i).getIdBook(), 
						caddy.get(i).getTitle(),
						caddy.get(i).getAuthor(),caddy.get(i).getUnitaryPrice(),caddy.get(i).getQty());
			}			

			System.out.println("------------------------------------------------------------------------------------------------------------");
			// calcul du montant de la commande
			double total=0;
			for (int i = 0; i < caddy.size(); i++) {
				double prix =caddy.get(i).getUnitaryPrice();
				double qty =caddy.get(i).getQty();

				double subTotal=prix*qty;
				total+=subTotal;

			}
			// affichage du total de la commande
			System.out.printf("| %96s | %-2s |%n"," TOTAL COMMANDE",total);
			System.out.println("------------------------------------------------------------------------------------------------------------");		
		}
	}
	/**
	 * Method that modifies the basket
	 * @param scan
	 */
	public static void displayCaddy() {

		caddy();
		// caddy not empty, show menu
		if (!shopJob.readCaddy().isEmpty()) {

			int rep=1;
			while(rep != 3) {

				System.out.println("1 : To edit a quantity.");
				System.out.println("2 : Delete an item.");
				System.out.println("3 : Leave cart.");

				while(!scan.hasNextInt()) {
					System.out.println("The entered value is incorrect, enter a new entry.");
					scan.next();
				}
				rep = scan.nextInt();

				switch(rep) {
				case 1 : // Editing a quantity
					System.out.println("To modify a quantity enter ref.");
					int	index=scan.nextInt();

					System.out.println("Enter the new quantity.");
					int qty=scan.nextInt();

					shopJob.updateCaddy(index,qty);
					caddy();
					break;

				case 2 : // Delete an article by its ref
					System.out.println("To delete an article type its ref.");
					index=scan.nextInt();
					shopJob.deleteCaddy(index);
					caddy();
					break;

				case  3: // Exit 
					System.out.println("Basket exit.");
					break;

				default : System.out.println("Wrong entry, your choice: "+rep+" does not exist in the menu");
				}	
			}
		}

	}
	/**
	 * Method that validates the command
	 * @param userOk 
	 * @param scan
	 */
	public static void displayCommand(Customer userOk) {

		if (shopJob.readCaddy().isEmpty()) {
			System.out.println("---------------------------------------");
			System.out.println("	You have no order "+userOk.getName());
			System.out.println("---------------------------------------");
		} else {
			System.out.println("---------------------------------------");
			System.out.println("	Your order "+userOk.getName());
			System.out.println("---------------------------------------");
			caddy();
			// if order we can validate
			System.out.println("Validate the  command ? Y/N");
			String rep = scan.next().toUpperCase();

			int idOrder=shopJob.order(userOk.getIdCustomer());
			if (rep.equals("Y")&& idOrder!=0) {
				System.out.println("Order validated "+userOk.getName()+" numéro de commande : "+idOrder);
				shopJob.clearCart();
			} else {
				System.out.println("problème lors du passsage de commande");
				System.out.println("Cart still valid");

			}

		}

	}
}

