package JAVA_QUIZ_005;

import java.util.*;

public class HanJa_Test {
	public static void main(String[] args) {
		String data[] = {
				"�� ����� ��� ���ֳ� ���� �� ���� �� ����'2'��������(���ڵ���) : ������ ��� ���� ���� ���Ѵ�.'��������(���ڹ�ġ) : �� ����� ��� ���ֳ� ���� �� ���� �� ����.'ʢ����٤(���ιڸ�) : ������ ���� �ʹ� ����� ���� ��ź���� �ʴ�.'ʴְ��ϴ(�����ֱ�) : ������ �ʹ� �ŵξ� ���̰� ����� �Ժη� ���Ѵ� ��.'��������(���𸮼�) : ���� ������ ���߱� ���� �����ϰ� �̷ο� ��",
				"���� ������ ������ ���� ������ ������ ����'3'ͮհ����(�������) : �ް����� ���� �ִ�. ����� ���� ����� ��ó�� ���� ��ȸ�� ������ ���� ���� �� �ȵȴ�.'��������(�����߷� : �� �� ���� �Ϳ� ������ �ʰ� ���� �淯 �ٽ� �ĵ�� �´�.)'��������(�汹���� : ���� ������ ������ ���� ������ ������ ����.)'��������(����ʻ� : ������ ���̸� ������ ����Ѵ�. �ٽɰ����� ����.)'��ڦ����(�ι����� : �� �ȸ� ������ ������ ������ �ʴ´�.)",
				"��ܿ��� �԰� ����� ����. �������� ���� ���� ���� �Ѵ� '1'�������(���Ǿ��� : ��ܿ��� �԰� ����� ����. �������� ���� ���� ���� �Ѵ�)'��Ρ���(�ݰ����� : ���̳� ������ ������ ��Ģ�̳� ����.)'��������(���ȸ�� : ���� ���ϴٰ� �ٽ� ��Ƴ���.)'�������(�����Ұ� : ���� ������ ������ ��� ���� �ܷ�� �ִ�)'Ϣ������(�������� : �Կ��� ������ ����. ���� ��ġ�ϴ�)",
				"ũ�� �� �׸�(���)�� �ʰ� �̷�� ����.'5'������(�뵿���� : ũ�� ���� ������ �۰� ���� �ٸ���. ���� ����)'�������(�����̸� : ���� ���ڸ��� ���� ������ ���� �ٸ� ���� �۴�.)'��������(��ǻ�� : ��� ���� �ݹ��̴�.)'����ʦ��(��ȭ��ģ : ����� �������� ���ϴ�. �������� å�� �������ϴ� ��.)'����ع��(��⸸�� : ũ�� �� �׸�(���)�� �ʰ� �̷������)",
				"��� ���� �ݵ�� �ٸ� ���� ���ư�'4'ު�ު��(��º�� : �̰͵� ���͵� �ƴ� ���߰� �� ���� �����Ͽ� �̸��� ��)'��������(�ҿ�õ�� : �� ���� ������ �޷����� ���� �����Ͽ� �̸��� ��)'������ӹ(������� : ���� ���� ������ ���� ���� ����.)'��������(���ʱ��� : ��� ���� �ݵ�� �ٸ� ���� ���ư�.)'߲������(����ʷ� : ���縦 ��� ���� ���� �ְ� �����)",
				"������ ���� �̰� ���ϸ� �̿��� �Բ� �����ϴٴ� �� '2'�������(�Ӽ���å : ���� ���鼭 �����ҹٸ� �𸣰� ��¦ ���Ѵٴ� ��.)'��������(����ġ�� : ������ ���� �̰� ���ϸ� �̿��� �Բ� �����ϴٴ� ��.)'�������(�������� : �ӱݰ� ���ϻ����� ���Ϳ� ����)'�������(����ٿ� : ���� ��� �׸�ŭ ��Ǵ� ���� ����)'�������(�ҿ����� : �ٶ�� �ٸ� �̷�)",
				"���� ���⸦ ���ɰ� ����� �����⸦ �� �Ѱ� ���� �ٸ��� '1'����Ϸ�(��α��� : ���� ���⸦ ���ɰ� ����� �����⸦ �� �Ѱ� ���� �ٸ���.)'�������(��ȣ��ȯ : ������ ��Ǯ�� �� �̷κ��� ������ �ظ� �԰� ���� �̸��� ��)'�������(���ε��� : �ӱݰ� �鼺�� �Բ� ���)'�������(�������� : �Ǽ��� ���� ���� �ƺ��ϰ�, �����ϸ� Ǫ�����ϴ� ���� �ν�)'�ޫ��ժ(���񸮶�)",
				"ó�� ����� �ߴܽ����, ������ ���߰;��� ���������Ǵ� ��'3'�������(�������)'��������(�����׼� : ��� ���� �Ѷ��� ���� �Ͼ�� ��.)'ף����ڭ(��λ�� : ó�� ����� �ߴܽ����, ������ ���߰;��� ���������Ǵ� ��)'��Ϣ����(�������� : ������ ���� ���ų� ������ �̸�.)'��Ѧ��ܨ(�ӱ����� : �׶� �׶��� ��ȭ�Ǵ� ������ ���� ������ ó����)",
				"�̸� ���� ���� ����'5'�������(�������� : �ƹ��͵� ���� ���� ����.)'��˳����(������ó : ������ ���� ������ �����ϸ� ������ ���� �Ƴ�)'������(�������� : ȣȭ�ο� ��Ȱ)'�������(õ����Ȳ : �������� �Ǵٽ��� ���ǳ���� �����ϴ� ��)'���ݯ��(��ġ�ν� : �̸� ���� ���� ����)",
				"�θ� ����鿡�� �˷����� �Կ� ���������� ������ �޴´ٴ� ��'5'��������(ȯ��Ż�� : ���� ���� �����ϰ� ����Ͽ����鼭�� �� �Ը� �޸��� �� ���� �������� �ξ� �� �Ƹ��ٿ��� ��)'�������(�������� : �ѹ� �� ����� ���ƿ��� �ʰų� �ҽ��� ����.)'��������(������ : ��ſ����� ���ϸ� �������� �´�.)'��������(��Ÿ��� : �Ժη� ������ �ϴ� ��)'������Ϣ(ȸ���α� : �θ� ����鿡�� �˷����� �Կ� ���������� ������ �޴´ٴ� ��.)"				
		};
		int score = 0;
		Scanner sc = new Scanner(System.in);
		int c = 1;
		
		for(int i = 0; i<data.length; i++) {
			//1. String Ŭ������ String[] split(String regex, int limit)
			//����ؼ� ������ �������� �����ÿ�
			//2. ������ ����Ͻÿ�
			//3. �������� ������ ���� String[] split()�� ���
			//4. �ݺ����� �̿��ؼ� ����ϼ�
			String[] temp = data[i].split("'", 3);
			String question = temp[0];
			String answer = temp[1];
			String choice[] = temp[2].split("'");
			
			System.out.println("[" + (i+1) + "��] " + question);
			for(int j = 0; j < choice.length; j++) {
				System.out.print("\t" + (j+1) + ". " + choice[j].substring(0, 4) + "    ");
			} //for
			//�˸��� �ڵ带 �����ÿ�
			System.out.println();
			System.out.print("[����] : ");
			String in = sc.next();
			if(in.equals(answer)) {
				score++;
			}
			System.out.println();
		}//for
		System.out.println();
		System.out.println("���䰹��/��ü���׼� : " + score + "/10");
	}//main
	
}