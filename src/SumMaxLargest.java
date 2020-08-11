import java.util.Arrays;

/*
 * 3)Write a Java Program to find sum of unique elements in given Array?
4)Write a Java program to find third largest number in given Array ?
5)Write a java program to find maximum difference between two elements in given Array?
6)Write a Java Program to find Min and Max elements in given Array?
7)Write Java Program to find second Min and Second Max elements in given Array ?

*/
public class SumMaxLargest {

	public static void main(String[] args) {

		int[] arr1= {1, 6, 4, 3, 2, 2, 3, 8, 1};
		
		System.out.println("**********SUM OF DISTINCT**********");
		Arrays.stream(arr1).distinct().forEach(System.out::println);
		System.out.println(Arrays.stream(arr1).distinct().sum());
		
		System.out.println("**********Max**********");
		System.out.println("Maximum " +Arrays.stream(arr1).max());
		System.out.println("Minimum " + Arrays.stream(arr1).min());
		
		System.out.println("******ALTERNATE*********");
		int max=arr1[0];
		for(int a=1; a<arr1.length;a++) {
			if(arr1[a]>max) {
				max=arr1[a];}
		}
		System.out.println("max elelment "+ max);
		
		System.out.println("*********min************");
		int min=arr1[0];
		for(int a=1; a<arr1.length;a++) {
			if(arr1[a]<min) {
				min=arr1[a];}
		}
		System.out.println("min elelment "+ min);
		
		System.out.println("****************Difference*********");
		
		int difference=max-min;
		System.out.println("differen " +difference);
		
		
		System.out.println("*********Largest 3************");
		
		int [] arr2={ 6, 8, 1, 9, 2, 1, 10};
		int [] sArray= Arrays.stream(arr2).sorted().distinct().toArray();
		//for(int a:sArray) {System.out.println(a);}
		if(sArray.length<4) {
			System.out.println("Invalid length");
		}else {
		System.out.println(sArray[sArray.length-3]);
		}
		
		System.out.println("*********Largest 2 and samllest 2************");
		
		System.out.println("2nd Largest " +sArray[sArray.length-2]);
		System.out.println("2nd smallest " +sArray[1]);
		
	}

}
