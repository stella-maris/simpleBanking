/**
 * 
 */
package a01014196_assignment1;

/**
 * @author Mary Lee (a01014196)
 *
 */
public class BankCustomer {
	private String firstName;
	private String lastName;
	private String accountNumber;
	private String passcode;
	private double currentBalance;

	/**
	 * Default constructor for a BankCustomer. Sets the fields to the default values
	 * for each type.
	 */
	public BankCustomer() {
	}

	/**
	 * @param firstName
	 *            String to initialize the firstName field
	 * @param lastName
	 *            String to initialize the lastName field
	 * @param accountNumber
	 *            String to initialize the accountNumber field
	 * @param passcode
	 *            String to initialize the passcode field
	 */
	public BankCustomer(String firstName, String lastName, String accountNumber, String passcode) {
		setFirstName(firstName);
		setLastName(lastName);
		setAccountNumber(accountNumber);
		setPasscode(passcode);
		setBalance(0.0);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (firstName != null && firstName.trim().length() > 0) {
			this.firstName = firstName;
		}
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		if (lastName != null && lastName.trim().length() > 0) {
			this.lastName = lastName;
		}
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber
	 *            the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		if (accountNumber != null && accountNumber.trim().length() > 0) {
			this.accountNumber = accountNumber;
		}
	}

	/**
	 * @return the passcode
	 */
	public String getPasscode() {
		return passcode;
	}

	/**
	 * @param passcode
	 *            the passcode to set
	 */
	public void setPasscode(String passcode) {
		if (passcode != null && passcode.trim().length() > 0) {
			this.passcode = passcode;
		}
	}

	/**
	 * 
	 * @return the balance as a double
	 */
	public double getBalance() {
		return currentBalance;
	}

	/**
	 * 
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) {
		this.currentBalance = balance;
	}

	/**
	 * @param amount
	 *            a double to add to the existing balance field
	 */
	public void addToBalance(double amount) {
		if (amount > 0) {
            currentBalance += amount;
            setBalance(currentBalance);
        }
	}
	
	/**
	 * @param amount	a double to subtract from the balance field
	 */
	public void subtractFromBalance(double amount) {
		if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            setBalance(currentBalance);
        } else {
        		System.err.println("You do not have an overdraft");
        }
	}
	
	/**
	 * @return details for BankCustomer
	 */
	public String toString() {
		return "BankCustomer [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber + ", passcode=" + passcode + ", balance=" + currentBalance +"]";
	}
}
