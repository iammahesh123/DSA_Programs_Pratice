package matrix;
import java.util.Scanner;

public class TransposeMatrix {
	static void printTransposeMatrix(int[][] arr,int r,int c) {
		// naive approach
		int[][] temp = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++ ) {
				temp[i][j] = arr[j][i];
			}
		}
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++ ) {
				arr[i][j] = temp[i][j];
			}
		}
		printMatrix(arr,r,c);
	}
	static void printMatrix(int arr[][],int r,int c) {
		System.out.println("Transpose Matrix: ");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++ ) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void printTransposeMatrix2(int[][] arr,int r,int c) {
		  int [][] result = new int[arr[0].length][arr.length];
		//efficient solution
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++ ) {
			result[j][i] = arr[i][j];
			}
		}
		System.out.println("Transpose Matrix: ");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++ ) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix row size: ");
		int row = sc.nextInt();
		System.out.println("Enter the matrix column size: ");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter the elements: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++ ) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original Matrix: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++ ) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		printTransposeMatrix2(arr,row,col);
	}

}
