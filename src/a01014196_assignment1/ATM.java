/**
 * 
 */
package a01014196_assignment1;

/**
 * @author Mary Lee (a01014196)
 *
 */
public class ATM {
	private InputReader inputReader; //connects InputReader to ATM
	private boolean isSignedIn; //checks whether user signed in
	/**
	 * Default constructor. Calls the initialize() method to seed the Bank with some BankCustomers. 
	 * Calls the run() method to perform the primary program functions.
	 */
	public ATM() {
		inputReader = new InputReader();
		initialize();
		run();
	}
	
	/**
	 * Main method calls the class default constructor.
	 * @param args	For program arguments (not used)
	 */
	public static void main(java.lang.String[] args) {
		new ATM();
	}
	
	/**
	 * The primary application processor. All application functions are called from here. 
	 * Uses a loop to prompt users to perform banking transactions. 
	 * Must use switch/case selection to determine uses choices.
	 */
	public void run() {		
		// Enter the main command loop.  Here we repeatedly read menu options and
        // execute them until the user exits.
		boolean done = false;
		while (!done) {
			//call method welcome which holds menu
			//inputReader.getInt()
			//switch case
			//verifyCustomer
			//if not signed in
			isSignedIn = false;
			if (!isSignedIn) {
				printWelcome();
			} else {
				printMenu();
			}
			int input = inputReader.getIntInput();
			switch (input) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Thank you for banking at Bullwinkle's Bank");
				
				done = true;
				break;
			default: 
				System.err.println("Invalid selection");
				break;
			}
		}
	}
	
    /**
     * Print out the opening ATM menu for BankCustomer.
     */
	private void printWelcome() {
		System.out.println("Welcome to Bullwinkle's Bank");
		printMenu();
	}
	
	/**
	 * Print banking transaction menu options
	 */
	private void printMenu() {
		System.out.println("Choose one of the following options:");
		System.out.println("1 - Sign In");
		System.out.println("2 - Deposit");
		System.out.println("3 - Withdraw");
		System.out.println("4 - Display Account Info");
		System.out.println("5 - Exit");
	}
	/**
	 * Adds Customer references to the Back HashMap 
	 * as seed data for testing.
	 */
	public void initialize() {
		//initializes Customer references
		BankCustomer customer1 = new BankCustomer();
		customer1.setFirstName("Augustus");
		customer1.setLastName("Caesar");
		customer1.setAccountNumber("123");
		customer1.setPasscode("password");
		BankCustomer customer2 = new BankCustomer("Mary", "Lee", "ST-234", "123");
		//Adds customer references to hashmap
		Bank bank = new Bank();
		bank.createAccount(customer1);
		bank.createAccount(customer2);
	}
	
	/**
	 * Performs a deposit into a BankCustomer's account. Checks to see if the user has signed in.
	 * If not, then verifyCustomer() is called and the menu is displayed again.
	 */
	public void transactDeposit() {
		if (isSignedIn) {
			//get account number
			//get input of amount to deposit
			Bank.deposit(account, amount);
		} else {
			verifyCustomer();
		}	
	}
	
	/**
	 * Performs a deposit into a BankCustomer's account. Checks to see if the user has signed in. 
	 * If not, then verifyCustomer() is called and the menu is displayed again.
	 */
	public void transactWithdraw() {
		if (isSignedIn) {
			//get account number
			//get input of amount to withdraw
			Bank.withdraw(account, amount);
		} else {
			verifyCustomer();
		}
	}
	
	/**
	 * Displays a BankCustomer's account information 
	 * if the customer has been previously verified.
	 */
	public void displayAccountInformation() {
		if (isSignedIn) {
			//get account number
			//get input of amount to deposit
			Bank.displayCustomerInformation(customer);
		} else {
			verifyCustomer();
		}
	}
	
	/**
	 * To confirm a BankCustomer's account number and passcode. Called when the user is required to sign in to the application. 
	 * Will set a boolean so the user does not have to sign in again during the session.
	 */
	public void verifyCustomer() {
		//printMenu();
	}
	
}
