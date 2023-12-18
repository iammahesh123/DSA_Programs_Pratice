package recursion;
import java.util.Scanner;

public class ToiMovesCount {
    static int checkMoves(int n , char source, char destination, char auxilary) {
        if(n == 0) return 0;
        int moves = checkMoves(n - 1, source,auxilary,destination);
        System.out.println("move disk "+n+" rod "+source+" to rod "+destination);
        moves += 1 + checkMoves(n - 1,auxilary,destination,source);
        return moves;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the no.of disks: ");
        System.out.println(checkMoves(n,'A','B','C'));

    }

}
