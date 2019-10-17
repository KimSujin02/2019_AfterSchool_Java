package JAVA_QUIZ_003;

public class CheckingAccountMain extends CheckingAccount {

	public static void main(String[] args) {
		CheckingAccount account = new CheckingAccount("111-222-33333333", "È«±æµ¿", 0, "5555-6666-7777-8888");
		
		account.deposit(100000);
		account.pay("5555-6666-7777-8888", 47000);
		
		System.out.println("ÀÜ¾× : " + account.balance);
	}

}