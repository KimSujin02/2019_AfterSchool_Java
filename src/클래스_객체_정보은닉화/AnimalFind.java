package Ŭ����_��ü_��������ȭ;

public class AnimalFind {
	
//	public void find(Ani_Cow cow) {
//		System.out.println("���� ���� �ϸ��ϴ�");
//		System.out.println(cow.name() + "�� " + cow.action() + "�� " + cow.eat() + "�� ����");
//		System.out.println();
//		cow.likeEat();
//	}
//	//�޼��� �����ε�(Ÿ���� Ʋ��) �߿��߿�
//	public void find(Ani_Lion lion) {
//		System.out.println("�糪�� �̻��� ���� ���ڴ�");
//		System.out.println(lion.name() + "�� " + lion.action() + "�� " + lion.eat() + "�� ����");
//		System.out.println();
//		lion.eatOther();
//	}
//	
//	public void find(Ani_Dog_Wolf dog) {
//		System.out.println("�Ϳ��� �ֱ�����");
//		System.out.println(dog.name() + "��" + dog.action() + "�� " + dog.eat() + "�� ����");
//		dog.special();
//	}
	
	public void find(Animal ani) { //�� �ִϸ��� ī��� ���̾��� �� ���ñ� ���ֳ���.. �̰��� �������ΰ���... 
		//�ٸ��� �ʿ���� �̰͸� ����ص� ���ο��� �� ���ư� ������ ��ġ�� AnimalMain
		//��� õ���� ������ �� �޼ҵ� �ϳ��� ��� ����� �� ����
		//������ ���ڸ� ���� �ִ� �޼ҵ�(�վƴ�)�� ��� �Ұ���
		if(ani instanceof Ani_Cow) {
			System.out.println("���� ���� �ϸ��ϴ�");
			System.out.println(ani.name() + "�� " + ani.action() + "�� " + ani.eat() + "�� ����");
			System.out.println();
		}
		
		else if(ani instanceof Ani_Cow) {
			System.out.println("�糪�� �̻��� ����");
			System.out.println(ani.name() + "�� " + ani.action() + "�� " + ani.eat() + "�� ����");
			System.out.println();
		}
		
		else if(ani instanceof Ani_Dog_Wolf) {
			System.out.println("�ֱ����� �Ϳ���");
			System.out.println(ani.name() + "�� " + ani.action() + "�� " + ani.eat() + "�� ����");
			System.out.println();
		}
	}

}
