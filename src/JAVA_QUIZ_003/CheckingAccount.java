package JAVA_QUIZ_003;

public class CheckingAccount extends Account {
	String cardNo;
	
	public CheckingAccount() {
	}
	
	public CheckingAccount(String accountNo, String ownerName,int balance, String cardNo) {
//		super.accountNo = accountNo;
//		super.ownerName = ownerName;
//		super.balance = balance;
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) {
		if(cardNo.equals(this.cardNo)) {
			if(amount <= balance) {
				balance -= amount;
				System.out.println("���Ҿ� : " + amount);
			}
			else {
				System.out.println("������ �Ұ����մϴ�.");
				amount = 0;
				System.out.println("���Ҿ� : " + amount);
			}
		}
		else {
			System.out.println("ī���ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		return amount;
	}
	
}
