package mathematics;
import java.util.Scanner;
public class UglyNumber {
	static boolean isUglyNumber(int n) {
        if(n <= 0) return false;
        if(n <= 6) return true;
        while(n % 2 == 0) n = n/2;
        while(n % 3 == 0) n = n/3;
        while(n % 5 == 0) n = n/5;
        return (n == 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if(isUglyNumber(num)) 
        System.out.println(num+" is ugly number");
        else
        System.out.println(num+" is not ugly number");

    }

}
