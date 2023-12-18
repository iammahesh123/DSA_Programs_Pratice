package matrix;
import java.util.Scanner;

public class RotateMatrix {
	static void printRotate90(int[][] arr) {
		//naive approach O(n2) time complexity and O{n) space complexity
		int n = arr.length;
		int[][] temp = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				temp[n - j - 1][i] = arr[i][j];
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = temp[i][j];
			}
		}
		System.out.println("Rotated by 90 matrix: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
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
	printRotate90(matrix);
	}
}
