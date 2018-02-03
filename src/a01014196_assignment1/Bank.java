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
		
	}
	
	/**
	 * Removes an BankCustomer from the HashMap.
	 * @param accountNumber	The key of the element to remove from the HashMap.
	 */
	public void closeAccount(java.lang.String accountNumber) {}
	
	/**
	 * Gets the BankCustomer from the HashMap and adds a double amount to a BankCustomer's balance.
	 * @param accountNumber	The account number of the BankCustomer.
	 * @param amount	The amount to deposit.
	 */
	public void deposit(java.lang.String accountNumber,
            double amount) {}
	
	/**
	 * Gets the BankCustomer from the HashMap and subtracts an amount from a BankCustomer's balance 
	 * as long as it does not leave a negative balance.
	 * @param accountNumber	The account number of the BankCustomer.
	 * @param amount	The amount to subtract from a BankCustomer's balance.
	 */
	public void withdraw(java.lang.String accountNumber,
            double amount) {}
	
	/**
	 * Displays the details of a BankCustomer element in the HshMap. 
	 * Uses BankCustomer.toString() implementation.
	 * @param customer	the BankCustomer chosen to display.
	 */
	public static void displayCustomerInformation(BankCustomer customer) {}
	
	/**
	 * Displays all elements of the HashMap by using BankCustomer.toString() 
	 * implementation of each
	 */
	public static void displayAllCustomers() {}
}
