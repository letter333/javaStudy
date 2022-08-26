class Person2 {
	private String name;
	private int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}

class Student2 extends Person2 {
	private String school;
	
	public Student2(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	public void print() {
		System.out.println("학생 정보");
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		System.out.println("학교 : " + this.school);
	}
}

class Teacher2 extends Person2 {
	private String dep;
	
	public Teacher2(String name, int age, String dep) {
		super(name, age);
		this.dep = dep;
	}
	
	public void print() {
		System.out.println("교사 정보");
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		System.out.println("소속 : " + this.dep);
	}
}
public class Answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu = new Student2("이유나", 24, "KB");
		Teacher2 t = new Teacher2("이유나", 24, "KB");
		
		stu.print();
		t.print();
	}

}
