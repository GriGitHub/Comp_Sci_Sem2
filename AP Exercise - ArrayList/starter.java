import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayLists first = new ArrayLists();
		ArrayList<Integer> hello = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values do you want to add to the ArrayList? ");
		int num = sc.nextInt();
		first.addArrayValues(num, hello);
		first.printArrayList(hello);
		
		


		
	}
}
