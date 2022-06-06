import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println(Fibonacci(3));


		
	}
	public static void Fibonacci(int num){
		int first = num;
		int c = 0;
		while(true){
			if(c==first){
				break;
			}
			System.out.print(Recursion(c)+", ");
			c++;
		}
		
	}
	public static int Recursion(int num){
		int a = num;
		if((a==0)||(a==1)){
			return 1;
		}
		else{
			return Recursion(num)+Recursion(num-1);
		}
	}
}
