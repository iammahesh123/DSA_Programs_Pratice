package strings;

import java.util.Scanner;

public class MostOccuranceChar {
    public static char checkOccurance(String x) {
        int[] frequency = new int[26];
        for(char c : x.toCharArray()) 
        {
            frequency[c - 'a']++;
        }
        char maxchar = 'a';
        int maxcount = 0;
        for(int i = 0; i < 26; i++) {
            if(frequency[i] > maxcount)
            {
                maxcount = frequency[i];  
                maxchar = (char)('a' + i);
            } else if(frequency[i] == maxcount && (char) ('a' + i) < maxchar) {
                maxchar = (char) ('a' + i);
            }
        } 
        return maxchar;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1: ");
        String str = sc.nextLine();
        System.out.print(checkOccurance(str));

    }
    
}
