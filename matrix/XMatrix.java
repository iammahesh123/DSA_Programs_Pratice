package matrix;

import java.util.Scanner;

public class XMatrix {
	static boolean isDiagonal(int r,int c,int n)
    {
        if(r == c) return true;
        return (r+c == n -1);
    }
    public static boolean checkXMatrix(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(isDiagonal(i,j,grid.length)) {
                    if(grid[i][j] == 0) return false;
                } else {
                    if(grid[i][j] != 0) return false;
                }
            
            }
        }
        return true;
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
		boolean result = checkXMatrix(matrix);
		System.out.println("Matrix is X-Matrix: "+result);
    }

}
