package JAVA_QUIZ_001;

public class Quiz7_3 {
	public static void main(String args[]) {
		polyMethod(new Circle());
		polyMethod(new Rectangle());
		polyMethod(new Triangle());
	}
	
	public static void polyMethod(Shape ref) {
		ref.area();
		if(ref instanceof Circle) {
			System.out.println("��������  5�� ���� ������ " + ref.res); //ref.area()�ص� ��....
		}
		else if(ref instanceof Rectangle) {
			System.out.println("���̰� 10�̰�, ���̰� 10�� �簢���� ������ " + ref.res);
		}
		else if(ref instanceof Triangle) {
			System.out.println("���̰� 10�̰�, ���̰� 10�� �ﰢ���� ������ " + ref.res);
		}
		
	}

}
