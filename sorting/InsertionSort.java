package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void printOptimalInserion(int[] arr, int n) {
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }              
            arr[j+1] = key;
        }
        printArray(arr, n);

    }
    public static void printArray(int[] arr, int n) {
        System.out.println("Insertion sorted array: ");
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
        printOptimalInserion(arr,n);
    }
    
}
