package JAVA_QUIZ_001;

public class Quiz7_3 {
	public static void main(String args[]) {
		polyMethod(new Circle());
		polyMethod(new Rectangle());
		polyMethod(new Triangle());
	}
	
	public static void polyMethod(Shape ref) {
		
		if(ref instanceof Circle) {
			System.out.println("반지름이  5인 원의 면적은 " + ref.area());
		}
		else if(ref instanceof Rectangle) {
			System.out.println("넓이가 10이고, 높이가 10인 사각형의 면적은 " + ref.area());
		}
		else if(ref instanceof Triangle) {
			System.out.println("넓이가 10이고, 높이가 10인 삼각형의 면적은 " + ref.area());
		}
		
	}

}
