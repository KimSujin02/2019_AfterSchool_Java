package JAVA_QUIZ_003;

public class CreditLineAccountMain {

	public static void main(String[] args) {

		CreditLineAccount cla = new CreditLineAccount("000-11-111111", "김선달", 10000, 20000000);
		
		System.out.println("인출액 : " + cla.Withdraw(50000));
		System.out.println("잔   액 : " + cla.balance);
		System.out.println("마이너스 한도 : " + cla.creditLine);
		
	}

}
