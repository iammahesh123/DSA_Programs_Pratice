package recursion;

import java.util.Scanner;

class Tribonacci  {
    static int printTribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int tib[] = new int[n+1];
        tib[0] = 0;
        tib[1] = 1;
        tib[2] = 1;
        for(int i = 3; i <= n; i++) {
            tib[i] = tib[i-1] + tib[i-2] + tib[i-3];
        }
        return tib[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        int result = printTribonacci(n);
        System.out.println(result);
        
    }
    
}
