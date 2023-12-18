package sorting;

import java.util.Scanner;

//naive solution for intersection of two sorted arrays
public class NaiveIntersection {
    static void printInterestion(int[] arr1, int[] arr2, int m, int n) {
        for(int i = 0; i < m; i++) {
            if(i > 0 && arr1[i] == arr1[i-1])
            continue;
            for(int j = 0; j < n; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter arr1 elements: ");
        for(int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter arr2 elements: ");
        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        printInterestion(arr1,arr2,m,n);
    }
    
}
