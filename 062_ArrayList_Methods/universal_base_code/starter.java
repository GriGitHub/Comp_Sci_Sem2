import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		ArrayLists first = new ArrayLists();
		ArrayList<Integer> hello = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values do you want in the ArrayList? ");
		int second = sc.nextInt();
		int c = 0;
		while(true){
			if(c==second){
				break;
			}
			int rand1 = rand.nextInt(100)+1;
			hello.add(rand1);
			c++;
		}
		first.toStringArrayList(hello);
		first.getArrayListMax(hello);
		first.getArrayListMin(hello);
		first.getArrayListAverage(hello);
		
		
		


		
	}
}
