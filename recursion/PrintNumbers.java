package recursion;
import java.util.Scanner;

public class PrintNumbers {
    static void checkNumber(int n) {
        if(n>1)
         checkNumber(n-1);
         System.out.print(n+" ");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkNumber(num);
    }

}
