package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void printBubbleSort(int arr[], int n) {
        //naive solution with O(n * n) time complexity
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr,n);   
    }

    public static void printOptimalBubble(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            boolean swapped = false;
            for(int j = 0; j < n - i -1; j++)
            {
                if(arr[j] > arr[j + 1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped == false) break;
        }
        printArray(arr, n);
    }

    public static void printArray(int[] arr, int n) {
        System.out.println("Bubble sorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printBubbleSort(arr,n);
        printOptimalBubble(arr,n);

    }
    
}
