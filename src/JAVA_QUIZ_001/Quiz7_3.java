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
			Circle c = (Circle)ref;
			System.out.println("��������  " + c.r + "�� ���� ������ " + ref.res); //ref.area()�ص� ��....
		}
		else if(ref instanceof Rectangle) {
			Rectangle r = (Rectangle)ref;
			System.out.println("���̰� " + r.w + "�̰�, ���̰� " + r.h + "�� �簢���� ������ " + ref.res);
		}
		else if(ref instanceof Triangle) {
			Triangle t = (Triangle)ref;
			System.out.println("���̰� " + t.w + "�̰�, ���̰� " + t.h + "�� �ﰢ���� ������ " + ref.res);
		}
		
	}

}
