import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList <String> cookies = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many cookies?");
		int input = sc.nextInt();
		int c = 0;
		while(true){
			if(c==input){
				break;
			}
			cookies.add("Cookie");
			System.out.println(cookies.get(c));
			c++;
		}


		
	}
}
