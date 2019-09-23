package JAVA_QUIZ_001;

public class Quiz7_1 {
	public static void main(String args[]) {
		
		Shape ref = null;
		
		ref = new Circle(); //업캐스팅 *중요*
		
		System.out.println("도형의 면적은 " + ref.area());
		ref = new Rectangle();
		System.out.println("도형의 면적은 " + ref.area());
		ref = new Triangle();
		System.out.println("도형의 면적은 " + ref.area());
	}
}
