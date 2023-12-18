package recursion;
import java.util.Scanner;
public class FibnocciSeries {
    static int checkSeries(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        return checkSeries(n-1) + checkSeries(n-2);
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            System.out.print(checkSeries(i)+" ");
        }
    } 

}
