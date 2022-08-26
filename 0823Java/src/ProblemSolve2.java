class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printPerson() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
}

class Student extends Person {
	private String school;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	public void printStudent() {
		super.printPerson();
		System.out.println("학교이름 : " + this.school);
	}
}

class Teacher extends Person {
	private String dep;
	
	public Teacher() {
		super();
	}
	
	public Teacher(String name, int age, String dep) {
		super(name, age);
		this.dep = dep;
	}
	
	public void printTeacher() {
		super.printPerson();
		System.out.println("소속  : " + this.dep);
	}
}

public class ProblemSolve2 {
	public static void main(String args[]) {
		Student s = new Student("오세룡", 25, "경북산업직업전문학교");
		Teacher t = new Teacher("이범식", 33, "교육");
		
		System.out.println("Student");
		s.printStudent();
		
		System.out.println();
		
		System.out.println("Teacher");
		t.printTeacher();
	}
}
