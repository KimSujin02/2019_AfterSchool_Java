package 클래스_객체_정보은닉화;

public class MyFamily {

	public static void main(String[] args) {
		
//		GrandFa gr; //이건 클래스 (new를 하지 않았기 떄문에)
//		gr = new GrandFa(); //이건 객체(new를 했으므로 객체가 된다.)
//		//gr.setNai(85); //이렇게 해서 할아버지의 나이에 접근할 수 있게된다.(메소드를 사용하여)
//		System.out.println(gr.getNai());
		
		
		//GrandFa gr = new GrandFa(10);
		Father fa = new Father(51);
		
		fa.show();
		
		Me me = new Me();
		
		GrandFa gr = new GrandFa();
		
		System.out.println("===================================================");
		
		System.out.println(gr.gahoon);
		System.out.println(fa.gahoon);
		System.out.println(gr.say());
		System.out.println(fa.say());
		System.out.println(gr.eat());
		System.out.println(fa.eat());
		
		GrandFa gf = new GrandFa(83);
		
		System.out.println(gf.getNai());
		
		
		me.bike();
		
		System.out.println("====================상속시작===========================");
		
		System.out.println(fa.getNai());
		
		System.out.println(gr.getNai());
		
		System.out.println();
		
		
		//메모리에 생성자를 호출하며 클래스 객체를 만든다.
		
		
		
	}

}
