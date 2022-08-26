import java.util.Scanner;

class Cal {
	private char op;
	
	public Cal() {
		
	}
	
	public Cal(char op) {
		this.op = op;
	}
	
	public char getOp() {
		return this.op;
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
	
	public int rem(int a, int b) {
		return a % b;
	}
}
public class ProblemSolve1 {

	public static void main(String[] args) {
		Cal cal[] = new Cal[5];
		
		cal[0] = new Cal('+');
		cal[1] = new Cal('-');
		cal[2] = new Cal('*');
		cal[3] = new Cal('/');
		cal[4] = new Cal('%');
		
		Scanner sc = new Scanner(System.in);
		int res = 0;
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			
			char c = sc.next().charAt(0);
			
			if(c == cal[0].getOp()) {
				res = cal[0].sum(a, b);
			} else if(c == cal[1].getOp()) {
				res = cal[1].sub(a, b);
			} else if(c == cal[2].getOp()) {
				res = cal[2].mul(a, b);
			} else if(c == cal[3].getOp()) {
				res = cal[3].div(a, b);
			} else if(c == cal[4].getOp()) {
				res = cal[4].rem(a, b);
			}
			System.out.println(res);
		}
	}

}
