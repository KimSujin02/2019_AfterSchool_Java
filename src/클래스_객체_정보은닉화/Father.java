package Ŭ����_��ü_��������ȭ;

//������������ ���������� �� ����

public class Father extends GrandFa {
	
	private int nai = 5;
	private int house = 1;
	private String gabo = "Ȳ�ݵ���";
	
	public Father() {
		System.out.println("�ƹ��� ������");
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
		return "�ƹ��� ���� : �λ��� ��ܶ�";
	}
	
	public void show() {
		System.out.println("�ƹ����� ���� : " + this.gabo); //Ȳ�ݵ���.. �׳� gabo�Է��ص� �����ϴ�.
		System.out.println("�Ҿƹ����� ���� : " + super.gabo); //�Ҿƹ����� ����
		System.out.println(say()); //this�� ���� �ʾƵ� �ڽ��� ���� �� �켱�����̱� ������ �ƹ����� ������ ���´�..
		System.out.println(super.say());
		System.out.println("�ƹ����� ���� : " + getNai());
		System.out.println("�Ҿƹ����� ���� : " + super.getNai());
	}
	
	
}
