package BankAccount.First;

import java.time.format.DateTimeFormatter;

public class CheckingsAccount extends Accounts {
	
	private int Transactionsleft;
	private int deductions;
	
	CheckingsAccount(Customers customer, int acc_num, double bal, String D_C){
		Transactionsleft=2;
		cust = new Customers(customer.getName(),customer.getPNumber(),customer.getAddress(),customer.getAccNum());
		balance=bal;
		Date_Created=D_C;
		account_num=acc_num;
		deductions = 0;
	}

	public double makeWithdrawal(double withdrawal) {
		double x=0;
		if(balance>=withdrawal) {

			if(Transactionsleft<=0) {
				deductions+=10;
				System.out.println("An Additional amount of 10RS will be deducted from your account");
				balance=balance-10;
			}
			x = balance-withdrawal;
			balance = x;
			Transaction_Amount.add(withdrawal);
			Transaction_Date.add(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
			Transactionsleft--;
		}
		
		else {
			x=balance+5000-withdrawal;
			balance = x;
			Transactionsleft--;
		}
		return x;
		
	}

	@Override
	public void makeDeposit(double amount) {
		if(Transactionsleft<=0) {
			deductions+=10;
			System.out.println("An Additional amount of 10RS will be deducted from your account");
			balance=balance-10;
			Transactionsleft--;
		}
		balance+=amount;
		Transactionsleft--;
		Transaction_Amount.add(amount);
		Transaction_Date.add(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
	}

	@Override
	public void displayAllDeductions() {
		System.out.println("Your Total Deduction from your Checkings account is: " + deductions + "RS from Taxes");
	}
}
