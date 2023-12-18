package matrix;
import java.util.Scanner;

public class MainBoundaryMatrix {
	public static void printBoundarytraversal(int[][] arr, int n, int m) {
		if(n == 1) {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[0][i]+" ");
			}
		} else if(m == 1) {
			for(int i = 0; i < n; i++) {
				System.out.print(arr[i][0]+" ");
			}
		} else {
			for(int i = 0; i < m; i++) 
				System.out.print(arr[0][i]+" ");
			for(int i = 1; i < n; i++)
				System.out.print(arr[i][m-1]+" ");
			for(int i = n - 2; i >= 0; i--)
				System.out.print(arr[n-1][i]+" ");
			for(int i = m-2; i >= 0;i--)
				System.out.print(arr[i][0]+" ");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row length: ");
		int r = sc.nextInt();
		System.out.print("Enter the column length: ");
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original matrix: ");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		printBoundarytraversal(matrix,r,c);
		
	}

}
