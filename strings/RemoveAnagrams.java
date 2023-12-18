package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveAnagrams {
    public static List<String> removeAnagrams(String[] str) {
        String prev = " ";
        List<String> result = new ArrayList<>();
        for(int i = 0; i < str.length; i++) {
                char[] ch = str[i].toCharArray();
                Arrays.sort(ch);
                String curr = String.valueOf(ch);
                if(!curr.equals(prev)) {
                    result.add(str[i]);
                    prev = curr;
                }
        }
        
        return result;

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.print("Enter the strings in array: ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        List<String> Finalresult = removeAnagrams(str);
        System.out.print(Finalresult);
    }
    
}
