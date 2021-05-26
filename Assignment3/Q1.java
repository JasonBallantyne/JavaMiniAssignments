/*Implementation of a class named Account that contains:
	A dataeld named id for an account (default 0).
	A data field named balance for an account (default 0).
	A Date data field named dateCreated that stores the date when an account was created.
	A data field named annualInterestRate that stores the current interest rate (default 0).
	Assume all accounts have the same interest rate.
	A no-arg constructor that creates a default account and sets the date of creation.
	A constructor that creates an account with the specified id and balance and sets the date of
	creation.
	
	Getter (accessor) and setter (mutator) methods for id, balance, and annualInterestRate.
	A getter (accessor) method for dateCreated.
	A method named getMonthlyInterest() that returns the monthly interest amount (which
	is given by: balance*annualInterestRate/ 12).
	A method named withdraw that withdraws a specified amount from an account.
	A method named deposit that deposits a specified amount to an account.
	A toString() method that returns a string representation of an account (id, balance, and
	datecreated)

	Write a test program that creates an Account object with an account id of 101, a balance of
	$20,000,and set an annual interest rate of 0.045 (i.e. 4.5%). Withdraw $2,500 from the account and
	deposit $3,000. Display the balance, the monthly interest amount, and the date when the account
	was created.
*/

package Assignment3;

public class Q1 {
//	Test program that creates an Account object
    public static void main(String[] args) {
        Account account = new Account(101, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());

	    }
	}
//Creates an object with a balance of 0
class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }
    //Creates an account with an initial balance
    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }
    //Getter for id
    public int getId() {
        return this.id;
    }
    //Getter for balance
    public double getBalance() {
        return this.balance;
    }
    //Getter for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    //Getter for dateCreated
    public String getDateCreated() {
        return this.dateCreated.toString();
    }
 	//Setter for id 
    public void setId(int id) {
        this.id = id;
    }
    //Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //Setter for annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
	    }
    //This method returns the string representation of id, balance and datecreated
    public String toString () {
    	return "Account Id: " + id + "Balance: " + balance + "Date Created: " + dateCreated;
    }
}
