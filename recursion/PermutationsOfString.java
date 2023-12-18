package recursion;
import java.util.Scanner;
public class PermutationsOfString {
    static String swap(String a,int i, int j) {
        char temp;
        char[] c = a.toCharArray();
         temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return String.valueOf(c);

    }
    void printPermutations(String s, int start, int end) {
        if(start == end) {
            System.out.print(s+" ");
        }
        for(int i = start; i <= end; i++) {
        s = swap(s,start ,i);
        printPermutations(s,start + 1,end);
        s = swap(s,start ,i);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        PermutationsOfString ps = new PermutationsOfString();
        ps.printPermutations(str,0,n - 1);
    }
    

}
