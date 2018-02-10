/**
 * 
 */
package a01014196_assignment1;

/**
 * @author Mary Lee (a01014196)
 *
 */
public class ATM {
	private InputReader inputReader; // connects InputReader to ATM
	private boolean isSignedIn; // checks whether user signed in
	private Bank bank;
	private String account;

	/**
	 * Default constructor. Calls the initialize() method to seed the Bank with some
	 * BankCustomers. Calls the run() method to perform the primary program
	 * functions.
	 */
	public ATM() {
		inputReader = new InputReader();
		initialize();
		run();
	}

	/**
	 * Main method calls the class default constructor.
	 * 
	 * @param args
	 *            For program arguments (not used)
	 */
	public static void main(java.lang.String[] args) {
		new ATM();
	}

	/**
	 * Adds Customer references to the Back HashMap as seed data for testing.
	 */
	public void initialize() {
		// initializes Customer references
		BankCustomer customer1 = new BankCustomer();
		customer1.setFirstName("Augustus");
		customer1.setLastName("Caesar");
		customer1.setAccountNumber("ST-123");
		customer1.setPasscode("password");
		BankCustomer customer2 = new BankCustomer("Mary", "Lee", "ST-234", "123");
		// Adds customer references to hashmap
		bank = new Bank();
		bank.createAccount(customer1);
		bank.createAccount(customer2);
	}

	/**
	 * The primary application processor. All application functions are called from
	 * here. Uses a loop to prompt users to perform banking transactions. Must use
	 * switch/case selection to determine uses choices.
	 */
	public void run() {
		// Enter the main command loop. Here we repeatedly read menu options and
		// execute them until the user exits.
		isSignedIn = false;
		boolean done = false;
		printWelcome();
		while (!done) {
			// call method welcome which holds menu
			// inputReader.getInt()
			// switch case
			// verifyCustomer
			// if not signed in
			int input = inputReader.getIntInput();
			done = processInput(input);
		}
		System.out.println("Thank you for banking at Bullwinkle's Bank");
		System.out.println("DEBUG: Displaying all the accounts in the bank.");
		Bank.displayAllCustomers();
		done = true;
	}

	private boolean processInput(int input) {
		boolean exitMenu = false;
		switch (input) {
		case 1:
			verifyCustomer();
			break;
		case 2:
			transactDeposit();
			break;
		case 3:
			transactWithdraw();
			break;
		case 4:
			displayAccountInformation();
			break;
		case 5:
			exitMenu = true;
			break;
		default:
			System.err.println("Invalid selection");
			return exitMenu;
		}
		return exitMenu;
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
	 * Performs a deposit into a BankCustomer's account. Checks to see if the user
	 * has signed in. If not, then verifyCustomer() is called and the menu is
	 * displayed again.
	 */
	public void transactDeposit() {
		if (isSignedIn) {
			// get account number
			// get input of amount to deposit
			System.out.println("Enter the amount to deposit:");
			Double amount = inputReader.getDoubleInput();
			bank.deposit(account, amount);
			printMenu();
		} else {
			notSignedInErrorMsg();
			verifyCustomer();
		}
	}

	/**
	 * Performs a deposit into a BankCustomer's account. Checks to see if the user
	 * has signed in. If not, then verifyCustomer() is called and the menu is
	 * displayed again.
	 */
	public void transactWithdraw() {
		if (isSignedIn) {
			// get account number
			// get input of amount to withdraw
			System.out.println("Enter the amount to withdraw:");
			Double amount = inputReader.getDoubleInput();
			bank.withdraw(account, amount);
			printMenu();
		} else {
			notSignedInErrorMsg();
			verifyCustomer();
		}
	}

	/**
	 * Displays a BankCustomer's account information if the customer has been
	 * previously verified.
	 */
	public void displayAccountInformation() {
		if (isSignedIn) {
			// get account number
			System.out.println("Here is your information:");
			// System.out.println(bank.get(account));
			Bank.displayCustomerInformation(bank.get(account));
			printMenu();
		} else {
			notSignedInErrorMsg();
			verifyCustomer();
		}
	}

	/**
	 * To confirm a BankCustomer's account number and passcode. Called when the user
	 * is required to sign in to the application. Will set a boolean so the user
	 * does not have to sign in again during the session.
	 */
	public void verifyCustomer() {
		System.out.println("Enter Account Number:");
		account = inputReader.getStringInput();

		System.out.println("Enter Passcode:");
		String getPasscode = inputReader.getStringInput();

		boolean hasAccount = bank.containsKey(account);

		if (hasAccount) {
			BankCustomer verifiedCustomer = bank.get(account);
			if (verifiedCustomer.getPasscode().equals(getPasscode)) {
				// System.out.println("Password matches");
				isSignedIn = true;
			} else {
				System.err.println("ERROR: Either account number or passcode is not correct.");
			}
		} else {
			System.err.println("ERROR: Either account number or passcode is not correct.");
		}
		printMenu();
	}

	/**
	 * Displays error message if user is not signed in.
	 */
	public void notSignedInErrorMsg() {
		System.err.println("ERROR: You must LOGIN before you can perform a transaction.");
	}
}
