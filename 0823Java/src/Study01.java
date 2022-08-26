import java.util.Scanner;

class Person {
	private String name;
	private int height;
	private String gender;
	
	public Person() {
		
	}
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void print_p() {
		System.out.println("사람 정보");
		System.out.println("이름 : " + this.name);
		System.out.println("성별 : " + this.gender);
	}
}

class Student extends Person {
	private int num;
	private String ablity;
	
	public Student(String name, String gender, int num) {
		super(name, gender);
		this.num = num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void print_s() {
		System.out.println("학생 정보");
		System.out.println("학번 : " + this.num);
	}
}

public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Person p = new Person("이유나", "여자");
		Student stu = new Student("이유나", "여자", 18);
		
		p.setName("Leeyuna");
		//p.setNum(18130956);
		stu.setName("Leeyuna");
		stu.setNum(18130956);
		
		p.print_p();
		stu.print_s();
	}

}
