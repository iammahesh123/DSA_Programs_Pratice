package mathematics;

import java.util.Scanner;

public class NaiveGcd {
    static int findGCD(int a, int b) {
        int res = Math.min(a,b);
        while(res > 0) {
            if(a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        int result = findGCD(a, b);
        System.out.print("GCD of a,b: "+result);


    }
    
}
