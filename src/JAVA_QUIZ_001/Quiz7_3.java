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
			System.out.println("반지름이  " + c.r + "인 원의 면적은 " + ref.res); //ref.area()해도 됨....
		}
		else if(ref instanceof Rectangle) {
			Rectangle r = (Rectangle)ref;
			System.out.println("넓이가 " + r.w + "이고, 높이가 " + r.h + "인 사각형의 면적은 " + ref.res);
		}
		else if(ref instanceof Triangle) {
			Triangle t = (Triangle)ref;
			System.out.println("넓이가 " + t.w + "이고, 높이가 " + t.h + "인 삼각형의 면적은 " + ref.res);
		}
		
	}

}
