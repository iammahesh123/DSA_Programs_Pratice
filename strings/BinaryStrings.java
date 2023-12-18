package strings;

import java.util.Scanner;

public class BinaryStrings {
    public static int checkPossible(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') count++;
        }
        count = count * (count - 1)/2;
        return count;
    }
    public static void main(String aargs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary string: ");
        String str = sc.nextLine();
        int result = checkPossible(str);
        System.out.print("Possible substrings ends with 1 is: "+result);
    }
    
}
