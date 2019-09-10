package 클래스_객체_정보은닉화;

public class Ani_Cow extends Animal {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "소";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "풀";
	}

	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "낮";
	}

	public void likeEat() { //이거는 애니 카우만 갖고 있는거임. 애니몰이 쓰고 싶으면 캐스팅을 받아야 한다.
		System.out.println("사료도 좋아한다.");
	}
	
}
