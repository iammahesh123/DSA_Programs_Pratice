package matrix;
import java.util.Scanner;
public class SimpleMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println("Print arr["+n+"]["+n+"] matrix");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]+" ");		
			}
			System.out.println();
		}
	
	}
}
