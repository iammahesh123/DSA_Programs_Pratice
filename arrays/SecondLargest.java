package arrays;
import java.util.Scanner;

public class SecondLargest {
	 //naive approach
    static int getLargestEfficent(int arr[],int n) {
        int res = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }
    static int getSecondElement(int arr[], int n) {
        int result = -1;
        int largest = getLargestEfficent(arr, n);
        for(int i = 0; i < n; i++) {
            if(arr[i] != arr[largest]) {
                 if(result == -1)  result = i;
                 else 
                 if(arr[i] > arr[result])
                 {
                    result = i;
                 }
            }
        }
         return result;    
    }
    //efficent solution
    static int getSecondEfficent(int arr[],int n) {
        int large = 0;
        int result = -1;
        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[large]) {
                result = large;
                large = i;
            }
            else if(arr[i] != arr[large]) {
                if(result == -1 || arr[i] > arr[result])
                result = i;
            }
        }
        return result;
    }
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Largest Element position at: "+getSecondElement(arr, n));
        System.out.println("Second Largest Element position at: "+getSecondEfficent(arr, n));
    }

}
