class Phone {
	private String name;
	private String num;
	
	public Phone(String name, String num) {
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNum() {
		return this.num;
	}
	
	public void print() {
		System.out.println("Phone의 print실행");
		System.out.println("휴대폰 정보");
		System.out.println("기종 : " + this.name);
		System.out.println("번호 : " + this.num);
	}
}

class SmartPhone extends Phone {
	private String androidver;
	private String account;
	
	public SmartPhone(String name, String num, String account) {
		super(name, num);
		this.androidver = "13";
		this.account = account;
	}
	
	public void print() {
		System.out.println("SmartPhone의 print실행");
		System.out.println("스마트폰 정보");
		System.out.println("기종 : " + this.getName());
		System.out.println("번호 : " + this.getNum());
		System.out.println("안드로이드 버전 : " + this.androidver);
		System.out.println("계정 : " + this.account);
	}
	
}
public class Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone("보디가드", "010-2272-6311");
		SmartPhone sp = new SmartPhone("갤럭시 S20", "010-3194-0217", "ryong");
		
		p.print();
		System.out.println();
		sp.print();
	}

}
