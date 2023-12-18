package searching;

import java.util.Scanner;

public class LinearSearch {
	static void printSearch(int[] arr, int x) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x)
				System.out.print("Element found at position: "+i);
			else
				System.out.print("element is not found");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search: ");
		int x = sc.nextInt();
		printSearch(arr,x);
	}

}
