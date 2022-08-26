import java.util.Scanner;

class Clock2 {
	 private int hour;
	 private int min;
	 private int sec;
	 
	 public Clock2() {
		 
	 }
	 
	 public Clock2(int h, int m, int s) {
		 this.hour = h;
		 this.min = m;
		 this.sec = s;
	 }
	 
	 public void setTime(int hour, int min, int sec) {
		 this.hour = hour;
		 this.min = min;
		 this.sec = sec;
	 }
	 
	 public int getHour() {
		 return this.hour;
	 }
	 
	 public int getMin() {
		 return this.min;
	 }

	 public int getSec() {
		 return this.sec;
	 }
}
public class Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 시간 입력");
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();		
		
		
		Clock2 c1 = new Clock2(h, m, s);
		Clock2 c2 = new Clock2(h, m, s);
		
		c2.setTime(12, 40, 0);
		
		int sub_h = c2.getHour() - c1.getHour();
		int sub_m = c2.getMin() - c1.getMin();
		int sub_s = c2.getSec() - c1.getSec();
		
		System.out.println("현재 시각은 : " + c1.getHour() + "시 " + c1.getMin() + "분 " + c1.getSec() + "초");
		System.out.println("점심 시간은 : " + c2.getHour() + "시 " + c2.getMin() + "분 " + c2.getSec() + "초");
		System.out.println("점심시간까지 남은 시간은 " + sub_h + "시간 " + sub_m + "분 " + sub_s + "초");
	}

}
