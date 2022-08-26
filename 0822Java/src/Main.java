import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//a 97 A 65
		String s = sc.nextLine();
		
		int sum = 0;
		boolean isPrime = true;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
			sum = sum + s.charAt(i) - 96;
			} else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				sum = sum + s.charAt(i) - 38;
			}
		}
		
		if(sum == 1) {
			System.out.println("It is a prime word.");
			return;
		}
		
		for(int i = 2; i < sum; i++) {
			if(sum % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("It is a prime word.");
		} else {
			System.out.println("It is not a prime word.");
		}			
		
		
	}

}
