package 클래스_객체_정보은닉화;

public class Ani_Lion extends Animal{  //이것을 추상클래스로 만들거나 오버라이딩을 해줘야 에러가 사라진다.

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "사자";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "동물";
	}

	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "밤";
	}
	
	public void eatOther() {
		System.out.println("사자는 가끔은 물도 먹음");
	}
	
	
}
