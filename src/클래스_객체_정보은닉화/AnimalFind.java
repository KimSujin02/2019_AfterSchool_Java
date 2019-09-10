package 클래스_객체_정보은닉화;

public class AnimalFind {
	
//	public void find(Ani_Cow cow) {
//		System.out.println(cow.name() + "는 " + cow.action() + "에 " + cow.eat() + "을 먹음");
//		System.out.println();
//	}
//	//메서드 오버로딩(타입이 틀림) 중요중요
//	public void find(Ani_Lion lion) {
//		System.out.println(lion.name() + "는 " + lion.action() + "에 " + lion.eat() + "을 먹음");
//		System.out.println();
//	}
	
	public void find(Animal ani) { //이 애니몰이 카우와 라이언을 다 뭐시기 해주나봄.. 이것이 다형성인가봄... 
		//다른거 필요없고 이것만 사용해도 메인에서 잘 돌아감 메인의 위치는 AnimalMain
		//백명 천명의 정보도 이 메소드 하나로 모두 출력할 수 있음
		//하지만 사자만 갖고 있는 메소드(잇아덜)는 출력 불가임
		System.out.println(ani.name() + "는 " + ani.action() + "에 " + ani.eat() + "을 먹음");
		System.out.println();
	}

}
