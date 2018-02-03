/**
 * 
 */
package a01014196_assignment1;

/**
 * @author Mary Lee (a01014196)
 *
 */
public class ATM {

	/**
	 * Default constructor. Calls the initialize() method to seed the Bank with some BankCustomers. 
	 * Calls the run() method to perform the primary program functions.
	 */
	public ATM() {
		initialize();
		run();
	}
	
	/**
	 * Main method calls the class default constructor.
	 * @param args	For program arguments (not used)
	 */
	public static void main(java.lang.String[] args) {}
	
	/**
	 * The primary application processor. All application functions are called from here. 
	 * Uses a loop to prompt users to perform banking transactions. 
	 * Must use switch/case selection to determine uses choices.
	 */
	public void run() {

	}
	
	/**
	 * Adds Customer references to the Back HashMap 
	 * as seed data for testing.
	 */
	public void initialize() {
		
	}
	
	/**
	 * Performs a deposit into a BankCustomer's account. Checks to see if the user has signed in.
	 * If not, then verifyCustomer() is called and the menu is displayed again.
	 */
	public void transactDeposit() {
	}
	
	/**
	 * Performs a deposit into a BankCustomer's account. Checks to see if the user has signed in. 
	 * If not, then verifyCustomer() is called and the menu is displayed again.
	 */
	public void transactWithdraw() {

	}
	
	/**
	 * Displays a BankCustomer's account information 
	 * if the customer has been previously verified.
	 */
	public void displayAccountInformation() {
	}
	
	/**
	 * To confirm a BankCustomer's account number and passcode. Called when the user is required to sign in to the application. 
	 * Will set a boolean so the user does not have to sign in again during the session.
	 */
	public void verifyCustomer() {

	}
	
}
