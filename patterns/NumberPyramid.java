package patterns;

import java.util.Scanner;

public class NumberPyramid {
    static void printNumberPyramid(int n) {
        int i,j;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();0
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printNumberPyramid(n);
    }

}
