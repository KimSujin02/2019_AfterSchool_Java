package 클래스_객체_정보은닉화;

final public class Me extends Father { //final : 자식 만들 수 없다는 뜻
	private String name = "김수진";
	
	public Me() {
		System.out.println("내 생성자");
	}
	
	public void bike() {
		System.out.println("자전거로 세계여행");
	}

}