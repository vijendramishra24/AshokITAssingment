import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

/*
1)Write a Java Program to find duplicate elements in given Array?
Input:  1, 2, 5, 5, 6, 6, 7, 2
Output:  2, 5, 6
*/
public class ArraysDuplicate {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 5, 6, 6, 7, 2 };
		System.out.println("***********ARRAY ELEMENT*************");
		for (int a : arr) {
			System.out.println(a);
		}

		System.out.println("***********DISTINCT ELEMENT*************");
		// Stream Approach
		// System.out.println(Arrays.stream(arr).sum());
		int[] x = Arrays.stream(arr).distinct().toArray();

		for (int a : x) {
			System.out.println(a);
		}
		// OR
		// Arrays.stream(arr).distinct().forEach(System.out::println);
		System.out.println("***********Hasset********");
		// Conventional Approach
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int a : arr) {
			hs.add(a);
		}
		System.out.println(hs);
		
		System.out.println("***********Conventional********");
		
		
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<i;j++) {
			if(arr[i]==arr[j]) 
				break;
			if(i==j) {
				System.out.println(arr[i]);
			}
		}	
		}
		
		System.out.println("***********Duplicate ELEMENT*************");

		// Conventional Approach
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
