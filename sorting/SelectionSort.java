package sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void printOptimalSelection(int[] arr, int n) {
        //O(n*n) time complexity 

        for(int i = 0; i < n; i++) {
            int min_ind = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[min_ind];
                arr[min_ind] = temp;
        }
        printArray(arr, n);
    }
    public static void printArray(int[] arr, int n) {
        System.out.println("selection sorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printOptimalSelection(arr,n);
    }
    
}
