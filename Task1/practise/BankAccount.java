package practise;

public class BankAccount {
	public String accountNumber;
	public double balance;
	public String customerName;
	public String customerEmail;
	public int customerphoneNumber;
	
	public BankAccount() {
		System.out.println("Constructor called");
	}
	
	public BankAccount(String accountNumber, double balance, String customerName,String customerEmail,
	int customerphoneNumber) {
		System.out.println("Constructor called with para");
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.customerName=customerName;
		this.customerEmail=customerEmail;
		this.customerphoneNumber=customerphoneNumber;
	}
	
	public void depositFund(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("The amount deposited "+ depositAmount + " Balance amount is" + this.balance);
	}
	
	public void withdrawFund(double withdrawlAmount) {
		if(this.balance - withdrawlAmount < 0) {  // 
			System.out.println("Only "+ balance +" available");
		}
		else {
			balance -= withdrawlAmount;
			System.out.println("The amount withdrawn "+ withdrawlAmount + " Balance amount is" + balance);
		}
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber() {
		this.accountNumber= accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance() {
		this.balance= balance;
	}
	public String getcustomerName() {
		return customerName;
	}
	public void setcustomerName() {
		this.customerName= customerName;
	}
	
	public String getcustomerEmail() {
		return customerEmail;
	}
	public void setcustomerEmail() {
		this.customerEmail= customerEmail;
	}
	
	public int getcustomerphoneNumber() {
		return customerphoneNumber;
	}
	public void setcustomerphoneNumber() {
		this.customerphoneNumber= customerphoneNumber;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount BobsAccount = new BankAccount("12345", 0.0, "Bob", "mb@g.com,"
				+ "0000", 0);
		System.out.println(BobsAccount.getAccountNumber());
		System.out.println(BobsAccount.getBalance());
		
		

	}

}
