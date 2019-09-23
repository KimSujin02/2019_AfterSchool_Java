package JAVA_QUIZ_001;

public class Quiz7_3 {
	public static void main(String args[]) {
		polyMethod(new Circle());
		polyMethod(new Rectangle());
		polyMethod(new Triangle());
	}
	
	public static void polyMethod(Shape ref) {
		
		if(ref instanceof Circle) {
			System.out.println("��������  5�� ���� ������ " + ref.area());
		}
		else if(ref instanceof Rectangle) {
			System.out.println("���̰� 10�̰�, ���̰� 10�� �簢���� ������ " + ref.area());
		}
		else if(ref instanceof Triangle) {
			System.out.println("���̰� 10�̰�, ���̰� 10�� �ﰢ���� ������ " + ref.area());
		}
		
	}

}
