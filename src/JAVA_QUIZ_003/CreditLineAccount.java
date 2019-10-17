package JAVA_QUIZ_003;

public class CreditLineAccount extends Account {
	
	int creditLine;

	public CreditLineAccount(String accontNo, String ownerName, int balance, int creditLine) {
		super(accontNo, ownerName, balance);
		this.creditLine = creditLine;
		
	}
	
	@Override
	public int Withdraw(int amount) {
		
		if((balance + creditLine)<amount) {
			System.out.println("한도가 넘어서 인출이 불가능합니다.");
			return 0;
		}
		
		balance -= amount;
		return amount;
	}
	
	
	
	
}
