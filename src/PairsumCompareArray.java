import java.util.ArrayList;

/*8)Write a Java Program to find common elements among below 3 Arrays?
  9)Write a Java program to find element Pairs in given Array whose sum is equal to given number
  10)Write a Java Program to find smallest pair sum in given Array?
*/
public class PairsumCompareArray {

	public static void main(String[] args) {
		int ar1[] = { 1, 5, 10, 20, 40, 80 };
		int ar2[] = { 6, 7, 20, 80, 100 };
		int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

		System.out.println("****3 Arrays Comparisions******");
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int a = 0; a < ar1.length; a++) {

			for (int b = 0; b < ar2.length; b++) {

				for (int c = 0; c < ar3.length; c++) {

					if (ar2[b] == ar3[c] && ar1[a] == ar2[b]) {
						al.add(ar1[a]);
					}
				}
			}
		}
		System.out.println("Common Elelment(s) " +al);

	
	System.out.println("****find element Pairs******");
	
	
	
	}

}
