package searching;

import java.util.Scanner;

public class IterativeBinarySearch {
    // Iterative solution
    public static int printIterative(int[] arr, int n, int x) {
        int start = 0;
        int last = n - 1;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                start = mid + 1;
            else
                last = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int x = sc.nextInt();
        int result = printIterative(arr, n, x);
        if (result != -1)
            System.out.print("Element found at: " + result);
        else
            System.out.print("Element not found");
    }
}