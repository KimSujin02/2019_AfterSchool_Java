package JAVA_QUIZ_001;

public class Quiz7_1 {
	public static void main(String args[]) {
		
		Shape ref = null;
		
		ref = new Circle(); //��ĳ���� *�߿�*
		
		System.out.println("������ ������ " + ref.area());
		ref = new Rectangle();
		System.out.println("������ ������ " + ref.area());
		ref = new Triangle();
		System.out.println("������ ������ " + ref.area());
	}
}
