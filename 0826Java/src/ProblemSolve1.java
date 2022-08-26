abstract class Phone {
	abstract public String getNum();
	abstract public String getName();
	abstract public void print();
}

class CellPhone extends Phone {
	private String num;
	private String name;
	
	public CellPhone(String num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public String getNum() {
		return this.num;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void print() {
		System.out.println("CellPhone의 num : " + this.num);
		System.out.println("CellPhone의 name : " + this.name);
	}
}

class SmartPhone extends CellPhone {
	private String androidver;
	private String account;
	
	public SmartPhone(String num, String name, String androidver, String account) {
		super(num, name);
		this.androidver = androidver;
		this.account = account;
	}
	
	public String getAndroidver() {
		return this.androidver;
	}
	
	public String getAccount() {
		return this.account;
	}
	
	public void print() {
		System.out.println("SmartPhone의 num : " + this.getNum());
		System.out.println("SmartPhone의 name : " + this.getName());
		System.out.println("SmartPhone의 androidver : " + this.androidver);
		System.out.println("SamrtPhone의 account : " + this.account);
	}
}

public class ProblemSolve1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone cp = new CellPhone("010-8411-3995", "갤럭시s8");
		SmartPhone sp = new SmartPhone("010-3194-0217", "갤럭시s20", "13", "ryong");
		
		cp.print();
		System.out.println();
		sp.print();
		
		
	}

}
