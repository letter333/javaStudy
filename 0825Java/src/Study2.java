abstract class Person {
	abstract public void printName();
	abstract public void print();
}

class Me extends Person {
	public String name;
	
	public Me(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("이름 : " + this.name);
	}
	
	public void print() {
		System.out.println("배고파");
	}
}

public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Me me = new Me("오세룡");
		
		me.printName();
		me.print();
	}

}
