package arrays;
import java.util.Scanner;

public class LargestElement {
	 //Naive Approach it takes O(npower2) time complexity
    //it reduces to O(n) time complexity
    static int getLargestElement(int[] arr,int n) {
        for(int i = 0; i < n; i++) {
            boolean flag = true;
            for(int j = 0; j < n;j++) {
                if(arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag == true) return i;
        }
        return -1;

    }
    static int getLargestEfficent(int arr[],int n) {
        int res = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest Element position at: "+getLargestElement(arr,n));
        System.out.println("Largest Element position at: "+getLargestEfficent(arr,n));

    }

}
