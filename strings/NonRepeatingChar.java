package strings;

import java.util.HashMap;
import java.util.Scanner;


/*  Problem: Given a string S consisting of lowercase Latin Letters. 
Return the first non-repeating character in S. If there is no non-repeating character, return '$'. */
public class NonRepeatingChar {
    public static char checkNonRepeatChar(String str) {
        HashMap<Character,Integer> charFreq = new HashMap<>();
        for(char c : str.toCharArray()) {
            charFreq.put(c,charFreq.getOrDefault(c, 0) + 1);
        }
        for(char c : str.toCharArray()) {
            if(charFreq.get(c) == 1) {
                return c;
            }
        }
        return '$';
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.print(checkNonRepeatChar(str));

    }
    
}
