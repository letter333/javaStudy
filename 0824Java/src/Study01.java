import java.util.Scanner;

class A {
	private int n1;
	
	public A(int a) {
		this.n1 = a;
		System.out.println("클래스 A의 n1 저장");
	}
	
	public void print(String s) {
		System.out.println(s + "의 n1의 값 " + this.n1);
	}
}

class B extends A {
	private int n2;
	
	public B(int a, int b) {
		super(a);
		this.n2 = b;
		System.out.println("클래스 B의 n2저장");
	}
	
	public void print(String s) {
		System.out.println(s + "의 n2 값 " + this.n2);
	}
}

public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		A a = new A(i);
		
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		B b = new B(j, k);
		
		a.print("A");
		b.print("B");
	}

}
