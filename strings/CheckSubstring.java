package strings;

import java.util.Scanner;

class CheckSubstring {
    public static int checkPosition(String str1, String str2) {
        if(str1 == null || str2 == null || str2.length() > str1.length())
            return -1;
         for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean match = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;  
            }
        }

        return -1;        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the String 2: ");
        String s2 = sc.nextLine();
        int result = checkPosition(s1,s2);
        System.out.println(result);
    }
}