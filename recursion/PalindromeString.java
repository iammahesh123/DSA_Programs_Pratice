package recursion;
import java.util.Scanner;
public class PalindromeString {
    static boolean checkString(String str,int start,int end) {
        if(start >= end) return true;
        return ((str.charAt(start) == str.charAt(end)) && checkString(str,start + 1, end - 1));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = 0;
        int end = str.length()-1;
        if(checkString(str,start,end)) 
            System.out.println(str+" is a palindrome");
            else
            System.out.println(str+" is not a palindrome");
        
    }

}
