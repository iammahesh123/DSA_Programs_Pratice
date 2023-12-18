package matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumber {
	public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i=0; i<m; i++){
            int min=Integer.MAX_VALUE;
            int col=-1;
            for (int j=0; j<n; j++){
                if (matrix[i][j]<min){
                    min = matrix[i][j];
                    col = j;
                }
            }
            int max=Integer.MIN_VALUE;
            for (int k=0; k<m; k++){
                if (matrix[k][col]>max){
                    max = matrix[k][col];
                }
            }
            if (min==max){
                list.add(min);
            }
        }
        return list;
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
    }
}
