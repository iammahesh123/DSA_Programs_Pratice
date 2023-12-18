package recursion;
import java.util.Scanner;
public class TowerOfHanoi {
    static void checkDisks(int n, char start_tower,char middle_tower,char dest_tower) {
        if(n == 0) {
            return;
        }
        checkDisks(n-1, start_tower, dest_tower,middle_tower);
        System.out.println("Move disk "+n+" rod "+start_tower+" to rod "+dest_tower);
        checkDisks(n-1, middle_tower,start_tower,dest_tower );
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of disks: ");
        checkDisks(n,'A','B','C');
    }

}
