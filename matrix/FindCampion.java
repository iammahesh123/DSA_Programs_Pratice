package matrix;

import java.util.Scanner;

public class FindCampion {
    public static int findChampion(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            boolean isChampion = true;
            for(int j = 0; j < grid[i].length; j++) {
                if(i != j && grid[j][i] == 1) {
                    isChampion = false;
                    break;
                }
            }
            if(isChampion) return i;
        
        }  
        return -1;
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
		System.out.println("Champion team is: "+findChampion(matrix));
    }
}
