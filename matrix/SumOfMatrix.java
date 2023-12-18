package matrix;
import java.util.Scanner;
public class SumOfMatrix {
	static int[][] printSumMatrix(int a[][],int b[][]) {
		int row1 = a.length;
		int col1 = a[0].length;
		int row2 = b.length;
		int col2 = b[0].length;
		if(row1 != col1 || row2 != col2) 
			return new int[0][0];
		int[][] result = new int[row1][col1];
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j <col1; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row length of 1st matrix: ");
		int rowl = sc.nextInt();
		System.out.print("Enter the row length of 1st matrix: ");
		int col1 = sc.nextInt();
		int[][] matrixA = new int[rowl][col1];
		System.out.println("Enter the elements of 1st matrix: ");
		for(int i = 0; i < rowl; i++) {
			for(int j = 0; j < col1; j++) {
				matrixA[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the row length of 2st matrix: ");
		int row2 = sc.nextInt();
		System.out.print("Enter the row length of 2st matrix: ");
		int col2 = sc.nextInt();
		int[][] matrixB = new int[row2][col2];
		System.out.println("Enter the elements of 1st matrix: ");
		for(int i = 0; i < row2; i++) {
			for(int j = 0; j < col2; j++) {
				matrixB[i][j] = sc.nextInt();
			}
		}
		int finalresult[][] = printSumMatrix(matrixA,matrixB);
		System.out.println("Sum of two matrix: ");
		if(finalresult.length == 0) 
			System.out.println(-1);
		else {
			for(int i = 0; i < finalresult.length; i++) {
				for(int j = 0; j < finalresult[0].length; j++) {
					System.out.print(finalresult[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
