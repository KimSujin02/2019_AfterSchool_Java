package Ŭ����_��ü_��������ȭ;

public class Father extends GrandFa {
	
	private int nai = 55;
	private int house = 1;
	private String gabo = "Ȳ�ݵ���";
	
	public Father() {
		super();
		System.out.println("�ƹ��� ������");
	}
	
	public Father(int nai) {
		System.out.println("�ƹ��� ������");
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
	
	public String save() {
		return null;
	}
	
	
}
