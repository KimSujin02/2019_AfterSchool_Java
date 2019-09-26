package JAVA_QUIZ_002;

public class AccountMain {

	public static void main(String[] args) {
		
		Account a = new Account("111-222-3333333", "김영식", 200000);
		
		Account b = new Account("555-666-7777777", "박진희", 1000000);
		
		a.deposit(1000000);
		printAccount(a);
		
		b.Withdraw(200000);
		printAccount(b);

	}
	
	static void printAccount(Account account) {
		System.out.println("계좌번호 : " + account.accountNo + "\n예금주 이름 : " + account.ownerName + "\n잔액 : " + account.balance);
		System.out.println();
	}

}
