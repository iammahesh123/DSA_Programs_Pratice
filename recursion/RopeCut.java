package recursion;
import java.util.Scanner;

public class RopeCut {
    static int checkRopeCut(int n, int a, int b, int c) {
        if(n == 0) return 0;
        if(n < 1) return -1;
        int res = Math.max(checkRopeCut(n-a,a,b,c),Math.max(checkRopeCut(n-b,a,b,c),checkRopeCut(n-c,a,b,c)));
        
        if(res == -1) return -1;
        return res + 1;
    }
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rope size: ");
    int n = sc.nextInt();
    System.out.print("1st cut: ");
    int a = sc.nextInt();
    System.out.print("2st cut: ");
    int b = sc.nextInt();

    System.out.print("3rd cut: ");
    int c = sc.nextInt();
    System.out.println(checkRopeCut(n,a,b,c));


   }

}
