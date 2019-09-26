package JAVA_QUIZ_002;

public class Account {
	String accountNo; //°èÁÂ¹øÈ£
	String ownerName; //¿¹±ÝÁÖ
	int balance; //ÀÜ¾×
	
	public Account() {
		
	}
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int Withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			return amount;
		} else {
			return 0;
		}
	}
}
