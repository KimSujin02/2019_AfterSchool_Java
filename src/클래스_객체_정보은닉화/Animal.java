package 클래스_객체_정보은닉화;

abstract public class Animal { //추상메소드가 있기 때문에 메인에서 new클래스가 안된다. 
	//이 클래스를 쓰려면 다른 클래스에서 상속해야 한다. extends로... 그래야 다른 클래스에서 new할 수 이씀

		abstract public String name();
		
		abstract public String eat(); //추상 메소드는 로직이 필요없다.
		
		abstract public String action();
		
		
		public void print() {
			System.out.println("Animal 클래스의 print 메소드");
		}
}
