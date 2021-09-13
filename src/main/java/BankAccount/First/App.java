package BankAccount.First;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Customers customer1 = new Customers("Ahmed Rohan",54321,"House No. L-1",5);
    	
    	SavingsAccount SA = new SavingsAccount(2, customer1, 1, 50000, "13/09/21");
    	
    	SA.CheckBalance();
    	
    	System.out.println("Your Zakat calculation is " + SA.CalculateZakat());
    	
    	SA.makeWithdrawal(5000);
    	
    	SA.CheckBalance();
    	
    	SA.makeDeposit(2000);
    	
    	SA.CheckBalance();
    	
    	CheckingsAccount CA = new CheckingsAccount(customer1, 1, 30000, "13/09/21");
    	
    	CA.makeWithdrawal(5000);
    	
    	CA.makeDeposit(5000);
    	
    	CA.makeDeposit(5000);
    	
    	SA.PrintStatement();
    	
    	CA.PrintStatement();
    	
    	SA.transferAmount(3000, "Habib Bank");
    	
    	SA.displayAllDeductions();
    	
    	CA.displayAllDeductions();
}
}