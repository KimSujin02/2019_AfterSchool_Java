package Ŭ����_��ü_��������ȭ;

abstract public class Animal { //�߻�޼ҵ尡 �ֱ� ������ ���ο��� newŬ������ �ȵȴ�. 
	//�� Ŭ������ ������ �ٸ� Ŭ�������� ����ؾ� �Ѵ�. extends��... �׷��� �ٸ� Ŭ�������� new�� �� �̾�

		abstract public String name();
		
		abstract public String eat(); //�߻� �޼ҵ�� ������ �ʿ����.
		
		abstract public String action();
		
		
		public void print() {
			System.out.println("Animal Ŭ������ print �޼ҵ�");
		}
}
