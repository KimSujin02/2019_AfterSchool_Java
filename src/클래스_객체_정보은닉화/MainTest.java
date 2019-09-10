package 클래스_객체_정보은닉화;

public class MainTest {

	public static void main(String[] args) {
		Ani_Cow cow = new Ani_Cow();
		Ani_Lion lion = new Ani_Lion();
		
		
		System.out.println("소가 먹는 거 : " + cow.eat());
		System.out.println("사자가 먹는 거 : " + lion.eat());

	}

}
