package 클래스_객체_정보은닉화;

//전역변수보다 지역변수가 더 높다

public class Father extends GrandFa {
	
	private int nai = 5;
	private int house = 1;
	private String gabo = "황금돼지";
	
	public Father() {
		System.out.println("아버지 생성자");
	}
	
	public Father(int nai) {
		this();
		this.nai = nai;
	}

	public int getNai() {
		return nai;
	}
	
	public int getHouse() {
		return house;
	}
	
	public String getGabo() {
		return gabo;
	}
	
	public String say() {
		return "아버지 말씀 : 인생을 즐겨라";
	}
	
	public void show() {
		System.out.println("아버지의 가보 : " + this.gabo); //황금돼지.. 그냥 gabo입력해도 가능하다.
		System.out.println("할아버지의 가보 : " + super.gabo); //할아버지의 가보
		System.out.println(say()); //this를 하지 않아도 자신의 것이 더 우선순위이기 때문에 아버지의 말씀이 나온다..
		System.out.println(super.say());
		System.out.println("아버지의 나이 : " + getNai());
		System.out.println("할아버지의 나이 : " + super.getNai());
	}
	
	
}
