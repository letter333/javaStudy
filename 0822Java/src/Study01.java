import java.util.Scanner;

class Teacher {
	private String name;
	private int year;
	private String gender;
	
	public String getName() {
		return this.name;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setString(String gender) {
		this.gender = gender;
	}
	
	public Teacher(String name, int year, String gender) {
		this.name = name;
		this.year = year;
		this.gender = gender;
	}
	
	public Teacher(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
}
public class Study01 {
	
	public static void main(String[] args) {
		Teacher t[] = new Teacher[3];
		
		t[0] = new Teacher("이유나", "여자");
		t[1] = new Teacher("이동준", 2, "남자");
		t[2] = new Teacher("박준현", 3, "남자");
		
		System.out.println("교사 목록");
		for(int i = 0; i < 3; i++) {
			System.out.println("이름 : " + t[i].getName());
			System.out.println("경력 : " + t[i].getYear());
			System.out.println("성별 : " + t[i].getGender());
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String gender = sc.nextLine();
		
		Teacher me = new Teacher(name, gender);

			System.out.println("이름 : " + me.getName());
			System.out.println("경력 : " + me.getYear());
		System.out.println("성별 : " + me.getGender());
		System.out.println();
	}

}
