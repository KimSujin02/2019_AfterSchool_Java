package JAVA_QUIZ_004;

public class BonusPointAccount extends Account {

	int bonusPoint;
	
	public BonusPointAccount() {
		super();
	}

	public BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	@Override
	void deposit(int amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
		bonusPoint = amount / 1000;
	}
	
}
