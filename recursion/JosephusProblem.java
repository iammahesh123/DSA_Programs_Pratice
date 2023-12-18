package recursion;
import java.util.Scanner;
public class JosephusProblem {
    static int josephusCheck(int n, int k) {
        if(n == 1) return 1;
        return (josephusCheck(n -1, k) + k -1) % n + 1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of Persons: ");
        int n = sc.nextInt();
        System.out.print("Enter the which position to kill: ");
        int k = sc.nextInt();
        System.out.println("The person still alive at position: "+josephusCheck(n,k));
    }

}
