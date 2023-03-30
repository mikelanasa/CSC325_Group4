package com.mycompany.bakerysystem;
import java.util.Scanner;
public class Menu {
    
	// More menu items can be initiated - initial
	// Menu created using switches - probably much easier with FX
	/**************************************************
	 * START CUSTOMER MENU METHOD
	 *****************************************************/
	// Display Customer Menu
    Scanner Keyboard = new Scanner(System.in);
	void showCustomerMenu() throws Throwable {
		int option = -1;

		do {
			// Initial Before FX Implementation
			System.out.println("\n\n");
			System.out.println("-------------------------------------------");
			System.out.println("             CUSTOMER MENU            ");
			System.out.println("-------------------------------------------");
			System.out.println("1. View Bakery");
			System.out.println("2. Check Order Status");
			System.out.println("3. Cancel Order");
			System.out.println("4. View History");
			System.out.println("5. Logout");
			System.out.println("6. Exit System");
			System.out.print("Choose a system process (1-6): ");
			option = Keyboard.nextInt();
			switch (option) {
				case (1): {
					//viewBakery(); // View Bakery Products
					break;
				}
				case (2): {
					//checkStatus(); // Check Status of Existing Orders
					break;
				}
				case (3): {
					///cancelOrder(); // Changes Order Status to Canceled
					break;
				}
				case (4): {
					//viewHistory();// shows orders fulfilled
					break;
				}
				case (5): { // LogOut
					System.out.println("Successfully logged out!");
					//loggedinUserID = "";
					//welcome();// shows orders fulfilled
					break;
				}
				case (6): { // Exits System
					//exit();
				}
				default: {
					System.out.println("Invalid choice, please choose between 1-6");
				}

			} // end of switch
		} while (option != 6);

	}

	/************************************************
	 * END CUSTOMER MENU METHOD
	 ***************************************************/

	// Initial Prior to FX Implementation
	// More Options Can Be Created - Initial
	/************************************************
	 * START EMPLOYEE MENU METHOD
	 ******************************************************/

	// Display Employee Menu
    
	void showEmployeeMenu() throws Error, Throwable {
		int option = -1;

		do {
			// DISPLAY MENU HEADER
			System.out.println("\n\n");
			System.out.println("-------------------------------------------");
			System.out.println("                EMPLOYEE MENU               ");
			System.out.println("-------------------------------------------");
			System.out.println("1. View Bakery");
			System.out.println("2. View Orders");
			System.out.println("3. Update Order Status");
			System.out.println("4. Contact Customer");
			System.out.println("5. Logout");
			System.out.println("6. Exit System");
			System.out.print("Choose a system process (1-6): ");
			option = Keyboard.nextInt();
			switch (option) {
				case (1): {
					//viewBakery();
					break;
				}
				case (2): {
					//viewOrders(); // View All Existing Orders
					break;
				}
				case (3): {
					//changeStatus(); // Change The Status of Order using case
					break;
				}
				case (4): {
					//contactCustomer();// shows orders fulfilled
					break;
				}
				case (5): {
					System.out.println("Successfully logged out!");
					//loggedinUserID = "";
					//welcome();// shows orders fulfilled
					break;
				}
				case (6): {
					//exit(); // Exits System
				}
				default: {
					System.out.println("Invalid choice, please choose between 1-6");
				}

			} // end of switch
		} while (option != 6);

	}
        
}
