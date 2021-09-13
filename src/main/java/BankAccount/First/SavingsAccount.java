package BankAccount.First;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class SavingsAccount extends Accounts {
private float interest_rate;
private double Zakaat;

public SavingsAccount(float int_rate, Customers customer, int acc_num, double bal, String D_C) {
	int_rate = interest_rate;
	cust = new Customers(customer.getName(),customer.getPNumber(),customer.getAddress(),customer.getAccNum());
	account_num=acc_num;
	balance=bal;
	Date_Created=D_C;
	Zakaat = 0;
}

public float getInterest_rate() {
	return interest_rate;
}

public double CalculateZakat(){
	double x=0;
	if(balance>=20000) {
		x=(balance*2.5)/100;
		Zakaat=x;
	}
	
	else System.out.println("You are not eligible to pay for Zakaat this year");
	
	return x;
}

public double makeWithdrawal(double withdrawal) {
	
	double x=0;
	if(balance>=withdrawal) {
	x = balance-withdrawal;
	balance = x;
	Transaction_Amount.add(withdrawal);
	Transaction_Date.add(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
	}
	
	else System.out.println("Amount exceeds the total balance");
	return x;
	
}

@Override
public void makeDeposit(double amount) {
	balance+=amount;

	Transaction_Amount.add(amount);
	Transaction_Date.add(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
}

@Override
public void displayAllDeductions() {
	System.out.println("Your Deduction from your savings account is " + Zakaat + "deducted from your total of zakaat");
}
}
