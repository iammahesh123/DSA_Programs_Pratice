package recursion;
import java.util.Scanner;

public class PrintNumbersNto1 {
    static void checkNumber(int n) {
        if(n == 0) return;
        System.out.print(n+" ");
         checkNumber(n-1);
         
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkNumber(num);
    }

}
