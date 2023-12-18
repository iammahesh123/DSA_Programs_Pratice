package sorting;

import java.util.Scanner;

public class MergaSort {
    public static void mergeSort(int[] arr, int low, int high) {
        if(high > low )
        {
            int mid = low + (high-low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
           
        }     
    }
    
    private static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for(int i = 0; i < n2; i++) {
            right[i] = arr[mid+i+1];
        }
        int i = 0;
        int j = 0;
        int k = low;
        while(i < n1 && j < n2) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while(i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = right[j];
            k++;
            j++;
        }
        
    }

    public static void printArray(int[] arr) {
        System.out.println("Mergesort Array: ");
        int n = arr.length;
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
        int low = 0;
        int high = arr.length-1;
       
        mergeSort(arr,low,high);
        printArray(arr);
    }
    
}
