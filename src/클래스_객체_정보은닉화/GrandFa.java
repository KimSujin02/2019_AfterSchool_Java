package 클래스_객체_정보은닉화;

public class GrandFa {
	//클래스에 new해서 객체로 만드는 것을 '인스턴스화' 라고 한다.
	//예 ) Scanner sc; <<클래스
	//예 ) sc = new Scanner(); <<객체
	//클래스는 설계도 / 객체는..음
	
	private int nai = 80; //다른 클래스에서 수정하거나 접근하지 못하게 된다. 이렇게 접근제어자를 이용하여 권한을 주는 것을'정보 은닉화'라고 한다.(숨기는것 x)
	//but.공개된 메서드로 허락을 받아서 쓰려면 getter setter(직접접근을 막는 방법)
	//getter setter를 사용하면 직접접근은 불가능하지만 메소드를 이용해 접근할 수 있게된다.
	public String gabo = "삼강청자";
	protected String gahoon = "모든 일에 최선을"; //protected를 씀으로, 우리 가족만 쓸 수 있다. 이말임
	
	
	public GrandFa() {
		System.out.println("김양성");
	} 


	//각각의 객체에 접근 제어자를 사용하여 정보은닉을 함. 이런 개객체들이 모여있는  클래스를 '캡슐화'라고 함.
	
	public GrandFa(int nai) {
		//this(); //위에 기본생성자에 갔다가 다시 돌아오는 건ㄷ가.. 아 모르게따
		System.out.println("경수");
		this.nai = nai;
	}//이것을 만듦으로 기본생성자를 만들어 주지 않아서 페밀리클래스에서 에러가 뜬다.


	public String say() {
		return "할아버지 말씀 : 어려울 수록 즐겨라";
	}
	
	public String eat() {
		return "밥맛있게";
	}

	public int getNai() { //나이는 못바꾸고 알려주기만 할 수 있어진다.
		return nai;
	}

//	public int getNai() {
//		return nai;
//	}
//
//	public void setNai(int nai) { //set을 삭제하면 나이 바꿀수 있는 권한을 없애기 때문에 getter만 사용이 가능해짐. 이런 과정으로 나이를 바꾸지 않고 return만 할 수 있게 된다.
//		this.nai = nai;
//	}
	
	
	
}