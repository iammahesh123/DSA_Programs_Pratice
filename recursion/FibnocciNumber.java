package recursion;
import java.util.Scanner;
public class FibnocciNumber {
	  static int checkFib(int n) {
	        if(n == 0) return 0;
	        if(n == 1) return 1;
	        return checkFib(n-1) + checkFib(n-2);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        System.out.println(checkFib(num));
	    }

}
