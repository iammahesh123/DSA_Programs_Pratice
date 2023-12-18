package matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {
	static ArrayList<Integer>  printSpiralMatrix(int[][] arr,int r,int c) {
		ArrayList<Integer> result = new ArrayList<>();
		int top = 0;
		int right = c -1;
		int bottom = r - 1;
		int left = 0;
		while(top <= bottom && left <= right) {
			for(int i = left; i <= right; i++) {
				result.add(arr[top][i]);
			}
			top++;
			for(int i = top; i <= bottom; i++) {
				result.add(arr[i][right]);
			}
			right--;
		if(top <= bottom) {
			for(int i = right; i >= left; i--) {
				result.add(arr[bottom][i]);
			}
			bottom--;
		}
		if(left <= right) {
			for(int i = bottom; i >= top; i--) {
				result.add(arr[i][left]);
			}
			left++;
		}
		}
		
		return result;
		
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
			  ArrayList<Integer> finalResult = printSpiralMatrix(matrix, r, c);
			    System.out.println("Spiral matrix traversal: " + finalResult);
	}

}
