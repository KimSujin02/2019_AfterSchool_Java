package JAVA_QUIZ_002;

public class AccountMain {

	public static void main(String[] args) {
		
		Account a = new Account("111-222-3333333", "�迵��", 200000);
		
		Account b = new Account("555-666-7777777", "������", 1000000);
		
		a.deposit(1000000);
		printAccount(a);
		
		b.Withdraw(200000);
		printAccount(b);

	}
	
	static void printAccount(Account account) {
		System.out.println("���¹�ȣ : " + account.accountNo + "\n������ �̸� : " + account.ownerName + "\n�ܾ� : " + account.balance);
		System.out.println();
	}

}
