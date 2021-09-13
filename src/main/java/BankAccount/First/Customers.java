package BankAccount.First;

class Customers{
	private String name;
	private int p_number;
	private String address;
	private int acc_num;
	
	public Customers() {		//Default Constructor
		name="\0";
		p_number=0;
		acc_num=0;
		address="\0";
	}
	
	public Customers(String Name,int P_Number,String Address,int Acc_Num) {		//Parametrized Constructor
		name=Name;
		p_number=P_Number;
		address=Address;
		acc_num=Acc_Num;
		
	}
	
	//Getters
	
	public String getName() {		
		return name;
	}
	
	public int getPNumber() {
		return p_number;
	}
	
	public int getAccNum() {
		return acc_num;
	}
	
	public String getAddress() {
		return address;
	}
}






