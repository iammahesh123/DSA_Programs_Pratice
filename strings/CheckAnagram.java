package strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    //naive solution
    public static boolean checkAnagram(String str1,String str2) {
        if(str1.length() != str2.length() ) return false;
        char arr1[] = str1.toCharArray();
       Arrays.sort(arr1);
        str1 = new String(arr1);
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr2);
        str2 = new String(arr2);
        return str1.equals(str2);

    }
    //optimized solution
    static final int CHAR = 256;
     public static boolean checkAnagram2(String str1,String str2) {
        if(str1.length() != str2.length() ) return false;
        int count[] = new int[CHAR];
        for(int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i = 0; i < CHAR; i++) {
            if(count[i] != 0) return false;
        }
        return true;
     }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the String 2: ");
        String s2 = sc.nextLine();
        if(checkAnagram(s1,s2)) 
        System.out.println("Yes..both are anagrams");
        else
        System.out.println("No..both are not anagrams");
    }
    
}
