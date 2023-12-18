package mathematics;

import java.util.Scanner;

public class EuclidAlgoGCD {
    //efficient implementation
    static int findGCD(int a, int b) {
        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    //optimized implementation
    static int findGCD2(int a, int b) {
        if(b == 0) return a;
        else 
        return findGCD2(b, a % b);
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
