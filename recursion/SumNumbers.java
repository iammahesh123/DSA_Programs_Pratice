package recursion;
import java.util.Scanner;

public class SumNumbers {
    static int doSum(int n) {
        if(n == 1) return 1;
        return n + doSum(n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(doSum(num));
    }

}
