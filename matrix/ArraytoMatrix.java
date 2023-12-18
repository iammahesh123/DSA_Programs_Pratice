package matrix;

import java.util.Scanner;

public class ArraytoMatrix {
	public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if(original.length != m * n) 
        {
        	System.out.println("Impossible to given lengths");
        	return new int[0][0];
        }
        int i = 0;
        while(i < original.length) {
            for(int j = 0; j < m; j++) {
                for(int k = 0; k < n; k++) {
                    result[j][k] =  original[i];
                    i++;
                }
            }
        }
        return result;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int n = sc.nextInt();
		int[] arr = new int[n];;
		for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
		}
		System.out.println("Original array: ");
		for(int i = 0; i < n; i++) {
				System.out.print(arr[i]+" ");
		}
		System.out.println("Enter the row length to construct matrix: ");
		int r1 = sc.nextInt();
		System.out.print("Enter the column length to construct matrix: ");
		int c1 = sc.nextInt();
		int[][] result = construct2DArray(arr,r1,c1);
		System.out.println("Construct matrix: ");
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c1; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
