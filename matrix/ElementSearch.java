package matrix;

import java.util.Scanner;

public class ElementSearch {
	static void printSearchElement(int arr[][],int r, int c,int x) {
		//naive solution time complexity O(r * c) 
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(arr[i][j] == x) {
					System.out.println("The element is found at C[" +i+ "]["+j+"]");
					return;
				} 
					
				}		
			}
		System.out.println("Element is not found");
		}	
	static void printOptimizedSearch(int[][] arr, int r, int c, int x) {
		int i = 0; int j = c -1;
		while(i < r && j >= 0) {
			if(arr[i][j] ==  x) {
				System.out.println("Element found at: ["+i+"]["+j+"]");
				return;
				
			} 
			else if(arr[i][j] > x) j--; 
			else i++;
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
		System.out.print("Enter the element to search: ");
		int x = sc.nextInt();
		printSearchElement(matrix,r,c,x);
		printOptimizedSearch(matrix,r,c,x);
	}


}
