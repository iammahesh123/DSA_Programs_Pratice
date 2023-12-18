package patterns;

import java.util.Scanner;

public class NumberTriangle {
    static void printTriangle(int n) {
        int i,j;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printTriangle(n);
    }
    
}
