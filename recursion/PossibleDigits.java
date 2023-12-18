package recursion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class PossibleDigits {
	 static void backtrack(int arr[],int i,HashMap<Integer,String> hashMap,StringBuilder sb,ArrayList<String> result) {
	        if(sb.length() == arr.length) {
	            result.add(sb.toString());
	            return ;
	        }
	        String temp = hashMap.get(arr[i]);
	        for(int j = 0; j < temp.length(); j++) {
	            sb.append(temp.charAt(j));
	            backtrack(arr,i+1,hashMap,sb,result);
	            sb.deleteCharAt(sb.length() - 1);
	        }

	    }
	 
	    static ArrayList<String> checkPossibleDigits(int arr[],int n) {
	           ArrayList<String> result = new ArrayList<>();
	           HashMap<Integer,String> hashMap = new HashMap<>();
	           hashMap.put(2,"abc");
	           hashMap.put(3,"def");
	           hashMap.put(4,"ghi");
	           hashMap.put(5,"jkl");
	           hashMap.put(6,"mno");
	           hashMap.put(7,"pqrs");
	           hashMap.put(8,"tuv");
	           hashMap.put(9,"wxyz");
	           if(n == 0) return result;
	           backtrack(arr,0,hashMap,new StringBuilder(),result);
	           return result;

	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i < n;i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print(checkPossibleDigits(arr,n)+" ");
	    }

}
