package Ŭ����_��ü_��������ȭ;

public class GrandFa {
	//Ŭ������ new�ؼ� ��ü�� ����� ���� '�ν��Ͻ�ȭ' ��� �Ѵ�.
	//�� ) Scanner sc; <<Ŭ����
	//�� ) sc = new Scanner(); <<��ü
	//Ŭ������ ���赵 / ��ü��..��
	
	private int nai = 80; //�ٸ� Ŭ�������� �����ϰų� �������� ���ϰ� �ȴ�. �̷��� ���������ڸ� �̿��Ͽ� ������ �ִ� ����'���� ����ȭ'��� �Ѵ�.(����°� x)
	//but.������ �޼���� ����� �޾Ƽ� ������ getter setter(���������� ���� ���)
	//getter setter�� ����ϸ� ���������� �Ұ��������� �޼ҵ带 �̿��� ������ �� �ְԵȴ�.
	public String gabo = "�ﰭû��";
	protected String gahoon = "��� �Ͽ� �ּ���"; //protected�� ������, �츮 ������ �� �� �ִ�. �̸���
	
	
	public GrandFa() {
		System.out.println("��缺");
	} 


	//������ ��ü�� ���� �����ڸ� ����Ͽ� ���������� ��. �̷� ����ü���� ���ִ�  Ŭ������ 'ĸ��ȭ'��� ��.
	
	public GrandFa(int nai) {
		//this(); //���� �⺻�����ڿ� ���ٰ� �ٽ� ���ƿ��� �Ǥ���.. �� �𸣰Ե�
		System.out.println("���");
		this.nai = nai;
	}//�̰��� �������� �⺻�����ڸ� ����� ���� �ʾƼ� ��и�Ŭ�������� ������ ���.


	public String say() {
		return "�Ҿƹ��� ���� : ����� ���� ��ܶ�";
	}
	
	public String eat() {
		return "����ְ�";
	}

	public int getNai() { //���̴� ���ٲٰ� �˷��ֱ⸸ �� �� �־�����.
		return nai;
	}

//	public int getNai() {
//		return nai;
//	}
//
//	public void setNai(int nai) { //set�� �����ϸ� ���� �ٲܼ� �ִ� ������ ���ֱ� ������ getter�� ����� ��������. �̷� �������� ���̸� �ٲ��� �ʰ� return�� �� �� �ְ� �ȴ�.
//		this.nai = nai;
//	}
	
	
	
}