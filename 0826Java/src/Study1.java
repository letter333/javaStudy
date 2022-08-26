class A {
	private int n1;
	
	public A(int n) {
		System.out.println("n1의 값을 초기화.");
		this.n1 = n;
	}
	
	public void setN1(int a) {
		this.n1 = a;
	}
	
	public int getN1() {
		return this.n1;
	}
}

class B extends A {
	private int n2;
	
	public B(int a, int b) {
		super(a);
		this.n2 = b;
	}
	
	public int getB() {
		return this.n2;
	}

}
public class Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(1);
		B b = new B(3, 4);
		System.out.println("a의 n1값 : " + a.getN1());
		System.out.println("b의 n2값 : " + b.getN1());
		
	}

}
