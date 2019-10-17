package JAVA_QUIZ_004;

public class BonusPointAccountMain {

	public static void main(String[] args) {
		BonusPointAccount bp = new BonusPointAccount("333-33-333333", "김미영", 0, 0);
		
		
		bp.deposit(1200000);
		
		System.out.println("잔액 : " + bp.balance);
		System.out.println("누적 포인트 : " + bp.bonusPoint);
	}

}
