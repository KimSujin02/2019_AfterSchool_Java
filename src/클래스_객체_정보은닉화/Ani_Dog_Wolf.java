package Ŭ����_��ü_��������ȭ;

public class Ani_Dog_Wolf extends Ani_Wolf { //���밡 ������ �߱� ������ ��� �ΰ��� �������̵� �ص� �ȴ�. ���� ����ϴ� ����� ����ϴ�......

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "��� ġŲ";
	}

	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "��� ��";
	}
	
	@Override
	public String name() { //�켱������ �� �ڽ��̱� ������ ���뿡�� ����� �ص� �갡 ����.
		return "��";
	}
	
	public void special() { 
		System.out.println(name() + "�� " + action() + "�� " + eat() + "�� ����");
		System.out.println();
	}
	
}
