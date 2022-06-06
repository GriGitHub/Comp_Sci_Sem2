import pkg.*;
import java.util.*;

class starter {
	public static int recurPower(int base, int n){
		int a = base;
		int b = n;
		if(b==1){
			return a;
		}
		else{
			return a*recurPower(a,b-1);
		}

	}	

	public static void main(String args[]) {
	
		System.out.println(recurPower(2,4));
	}
}
