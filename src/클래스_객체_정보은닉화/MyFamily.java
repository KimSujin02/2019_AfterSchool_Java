package Ŭ����_��ü_��������ȭ;

public class MyFamily {

	public static void main(String[] args) {
		
//		GrandFa gr; //�̰� Ŭ���� (new�� ���� �ʾұ� ������)
//		gr = new GrandFa(); //�̰� ��ü(new�� �����Ƿ� ��ü�� �ȴ�.)
//		//gr.setNai(85); //�̷��� �ؼ� �Ҿƹ����� ���̿� ������ �� �ְԵȴ�.(�޼ҵ带 ����Ͽ�)
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
		
		System.out.println("====================��ӽ���===========================");
		
		System.out.println(fa.getNai());
		
		System.out.println(gr.getNai());
		
		System.out.println();
		
		
		//�޸𸮿� �����ڸ� ȣ���ϸ� Ŭ���� ��ü�� �����.
		
		
		
	}

}
