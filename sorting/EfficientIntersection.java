package sorting;

import java.util.ArrayList;
import java.util.Scanner;

//Efficient soltuion for intersection of two sorted arrays

public class EfficientIntersection {
    static ArrayList<Integer> printInterestion(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while(i < m && j < n) {
            if(i > 0 && arr1[i] == arr1[i-1]) {
                i++;
                continue;
            }
            if(arr1[i] < arr2[j]) { i++; }
            else if(arr1[i] > arr2[j]) { j++; }
            else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result;
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
        ArrayList<Integer> res = printInterestion(arr1,arr2,m,n);
        System.out.println(res);
    }
    
}
