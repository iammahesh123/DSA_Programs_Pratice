package matrix;

import java.util.Scanner;

public class SnakePattern {
	public static void printSnakePattern(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		} else {
			for(int j = arr[0].length - 1; j >= 0; j--) {
				System.out.print(arr[i][j]+" ");
			}
		}
		}
		
	}
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
	printSnakePattern(matrix);
	}
}
