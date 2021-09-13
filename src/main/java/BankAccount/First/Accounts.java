package BankAccount.First;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class Accounts {
protected Customers cust;
protected int account_num;
protected double balance;
protected String Date_Created;
protected ArrayList<DateTimeFormatter> Transaction_Date;
protected ArrayList<Double> Transaction_Amount;
protected ArrayList<Double> Transaction_Balance;

public Accounts() {					//Default Constructor
	cust = new Customers();
	account_num=0;
	balance=0;
	Date_Created="\0";
	Transaction_Date = new ArrayList<DateTimeFormatter>();
	Transaction_Amount = new ArrayList<Double>();
}

public Accounts(int acc_num,double bal, String D_C,Customers cust1) {		//Parameterized Constructor
	cust = new Customers(cust1.getName(),cust1.getPNumber(),cust1.getAddress(),cust1.getAccNum());
	account_num=acc_num;
	balance=bal;
	Date_Created=D_C;
	Transaction_Date = new ArrayList<DateTimeFormatter>();
	Transaction_Amount = new ArrayList<Double>();
}

public void CheckBalance() {
	System.out.println("Your total balance is: " + balance);
}

public abstract void makeDeposit(double amount);

//Getters
public int getAcc_Num() {
	return account_num;
}

public String getDate() {
	return Date_Created;
}


public void PrintStatement() {
	
	System.out.println("STATEMENT:");
	System.out.println("Account Holder's Name: " + cust.getName());
	System.out.println("Account Number: " + account_num);
	java.time.LocalDateTime date = java.time.LocalDateTime.now(); 
	for(int i=0;i<Transaction_Date.size();i++) {
	System.out.println("Transaction Date and Time: " + Transaction_Date.get(i).format(date));
	System.out.println("Transaction Amount: " + Transaction_Amount.get(i));
	}
	System.out.println("Your Remaining Balance is: " + balance);
	System.out.println("_____________________________________");
}

public void transferAmount(double amount,String Bnk) {
	balance-=amount;
	System.out.println("The amount of " + amount + "RS has been transferred to " + Bnk);
}

public abstract void displayAllDeductions();

}
