package mathematics;
import java.util.Scanner;

public class PalindromeNumber {
	public static int reverse(int num) {
		int result = 0;
		int temp = num;
		while(temp > 0) {
			result = result * 10 + temp % 10;
			temp = temp/10;
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(reverse(n) == n) 
			System.out.println(n+ " is palindrome");
		else
			System.out.println(n+ " is not Palinfrome");
	}
	

}
