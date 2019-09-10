package 클래스_객체_정보은닉화;

public class Ani_Dog_Wolf extends Ani_Wolf { //늑대가 네임을 했기 때문에 얘는 두개만 오버라이딩 해도 된다. 빚을 상속하는 개념과 비슷하다......

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "밥과 치킨";
	}

	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "밤과 낮";
	}
	
	@Override
	public String name() { //우선순위가 나 자신이기 떄문에 늑대에서 상속을 해도 얘가 나옴.
		return "개";
	}
	
	public void special() { 
		System.out.println(name() + "는 " + action() + "에 " + eat() + "을 먹음");
		System.out.println();
	}
	
}
