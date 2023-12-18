package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class NicePairs {
    final static int mod = 1000000007;
	public int reverse(int num) {
		int result = 0;
		int temp = num;
		while(temp > 0) {
			result = result * 10 + temp % 10;
			temp = temp/10;
		}
		return result;
	}
     int checkPairs(int[] arr) {
        int len = arr.length;  
        long result = 0;
        for(int i = 0; i < len; i++) 
        arr[i] = arr[i] - reverse(arr[i]);
        Arrays.sort(arr);
        for(int i = 0; i < len - 1; i++) {
            long cont = 1;
            while(i < len - 1 && arr[i] == arr[i + 1])
            {
                cont++;
                i++;
            }
            result = (result %mod + (cont*(cont-1))/2)%mod;
        }
        return (int) result % mod;
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NicePairs np = new NicePairs();
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(np.checkPairs(arr));
    }

}
