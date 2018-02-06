/**
 * 
 */
package a01014196_assignment1;
import java.util.HashMap;
/**
 * @author Mary Lee (a01014196)
 *
 */
public class Bank {
	public static java.util.HashMap<String,BankCustomer> theBank;
	/** starting point for account numbers -- currently set to 100 */
    public static final int FIRST_ACCOUNT_NUMBER = 100; 
    /* number of the first account created */
    private static int accountCounter = FIRST_ACCOUNT_NUMBER;
	/**
	 * Default constructor for Bank class. Initializes the HashMap
	 */
	public Bank() {
		theBank = new HashMap<String, BankCustomer>();
	}
	
	/**
	 * Adds a new BankCustomer element to HashMap.
	 * @param newCustomer	The new element to add to the HashpMap using 
	 * the account number as the key and the new BankCustomer as the value.
	 */
	public void createAccount(BankCustomer newCustomer) {
		if (newCustomer != null) {
			String accountNumber = assignAccountNumber();
			theBank.put(accountNumber, newCustomer);
		}
	}
	
    /**
     * Assigns the first available account number and updates
     * the account counter for the next number
     */
    private String assignAccountNumber()
    {
        String setAccountNumber = Integer.toString(accountCounter);                    // get the first available number
        accountCounter++; // for the next account
        return setAccountNumber;
    }
	
	/**
	 * Removes an BankCustomer from the HashMap.
	 * @param accountNumber	The key of the element to remove from the HashMap.
	 */
	public void closeAccount(String accountNumber) {
		if (accountNumber != null) {
			theBank.remove(accountNumber);
		}
	}
	
	/**
	 * Gets the BankCustomer from the HashMap and adds a double amount to a BankCustomer's balance.
	 * @param accountNumber	The account number of the BankCustomer.
	 * @param amount	The amount to deposit.
	 */
	public void deposit(String accountNumber, double amount) {
		if (theBank.containsKey(accountNumber)) {
			if (amount > 0) {
				BankCustomer customer = theBank.get(accountNumber);
				customer.addToBalance(amount);
			}
		}
	}
	
	/**
	 * Gets the BankCustomer from the HashMap and subtracts an amount from a BankCustomer's balance 
	 * as long as it does not leave a negative balance.
	 * @param accountNumber	The account number of the BankCustomer.
	 * @param amount	The amount to subtract from a BankCustomer's balance.
	 */
	public void withdraw(String accountNumber,
            double amount) {
		if (theBank.containsKey(accountNumber)) {
			if (amount > 0) {
				BankCustomer customer = theBank.get(accountNumber);
				customer.subtractFromBalance(amount);
			}
		}
	}
	
	/**
	 * Displays the details of a BankCustomer element in the HshMap. 
	 * Uses BankCustomer.toString() implementation.
	 * @param customer	the BankCustomer chosen to display.
	 */
	public static void displayCustomerInformation(BankCustomer customer) {
		for (String accountHolder : theBank.keySet()) {
			if (theBank.get(accountHolder).equals(customer)) {
				customer.toString();
			}
		}
	}
	
	/**
	 * Displays all elements of the HashMap by using BankCustomer.toString() 
	 * implementation of each
	 */
	public static void displayAllCustomers() {
		for (String customer : theBank.keySet()) {
			customer.toString();
		}
	}
}
