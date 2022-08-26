import java.util.Scanner;

class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void print(String s) {
		System.out.println(s + "의 좌표 x : " + this.x + " y : " + this.y);
	}
}

class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void print(String s) {
		System.out.println(s + "의 좌표 x : " + this.getX() + " y : " + this.getY());
		System.out.println(s + "의 색상 : " + this.color);
	}
}

public class ProblemSolve1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		Point p1 = new Point(sc.nextInt(), sc.nextInt());
		ColorPoint p2 = new ColorPoint(sc.nextInt(), sc.nextInt(), sc.next());		
		p1.print("p1");
		p2.print("p2");
	}

}
