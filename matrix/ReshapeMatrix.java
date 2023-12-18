package matrix;

import java.util.Scanner;

public class ReshapeMatrix {
	 public static int[][] matrixReshape(int[][] mat, int r, int c) {
	        int row = 0;
	        int col = 0;
	        int[][] result = new int[r][c];
	        if(mat.length * mat[0].length != c * r) return mat;
	        for(int i = 0; i < mat.length; i++) {
	            for(int j = 0; j < mat[i].length; j++) {
	                result[row][col] = mat[i][j];
	                col++;
	                if(col == c) {
	                    row++;
	                    col = 0;
	                }
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
		System.out.print("Enter the row length to reshape: ");
		int r1 = sc.nextInt();
		System.out.print("Enter the column length to reshape: ");
		int c1 = sc.nextInt();
		int[][] result = matrixReshape(matrix,r1,c1);
		System.out.println("Original matrix: ");
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c1; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
