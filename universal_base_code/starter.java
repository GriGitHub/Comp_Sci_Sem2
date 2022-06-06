import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		


		
	}
	public static int factorial(int a){
		int x = a;
		int factorial = a;
		while(true){
			if(a==0){
				break;
			}
			factorial = factorial*a;
			a--;
		}
		return factorial;
	}
	public static double exponent(double a, double b){
		int x = a;
		int y = b;
		int result = a;
		int c = 0;
		while(true){
			if(c==b){
				break;
			}
			result = result*a
			c++;
		}
		return result;
	}
	public static double sin(double a){
		double x = a;
		double sin = x - (x*x*x)/factorial(3) + (x*x*x*x*x)/factorial(5) - (x*x*x*x*x*x*x)/factorial(7) + (x*x*x*x*x*x*x*x*x)/factorial(9) - (x*x*x*x*x*x*x*x*x*x*x)/factorial(11) + (x*x*x*x*x*x*x*x*x*x*x*x*x)/factorial(13);
		return sin;
	}
	public static double cos(double a){
		double x = a;
		double cos = 1 - (x*x)/factorial(2) + (x*x*x*x)/factorial(4) - (x*x*x*x*x*x)/factorial(6) + (x*x*x*x*x*x*x*x)/factorial(8) - (x*x*x*x*x*x*x*x*x*x)/factorial(10) + (x*x*x*x*x*x*x*x*x*x*x*x)/factorial(12);
		return cos;
	}
	//not finished
	public static double tan(double a){
		double x = a;
		double tan = x + (x*x*x)/3 + 2(x*x*x*x*x)/15;
		return tan;
	}
	public static double csc(double a){
		double x = a;
		double first = sin(x);
		return 1/first;
	}
	public static double sec(double a){
		double x = a;
		double first = cos(x);
		return 1/first;
	}
	public static double cot(double a){
		double x = a;
		double first = tan(x);
		return 1/first;
	}
	//not finished
	public static double ln(double a){
		double x = a;
		
	}
	public static double eX(double a){
		double x = a;
		double eX = 1 + x + (x*x)/factorial(2) + (x*x*x)/factorial(3) + (x*x*x*x)/factorial(4) + (x*x*x*x*x)/factorial(5) + (x*x*x*x*x*x)/factorial(6) + (x*x*x*x*x*x*x)/factorial(7) + (x*x*x*x*x*x*x*x)/factorial(8);
		return eX;
	}
	public static double sinh(double a){
		double x = a;
		double sinh = x + (x*x*x)/factorial(3) + (x*x*x*x*x)/factorial(5) + (x*x*x*x*x*x*x)/factorial(7) + (x*x*x*x*x*x*x*x*x)/factorial(9) + (x*x*x*x*x*x*x*x*x*x*x)/factorial(11) + (x*x*x*x*x*x*x*x*x*x*x*x*x)/factorial(13);
		return sinh;
	}
	public static double cosh(double a){
		double x = a;
		double cosh = 1 + (x*x)/factorial(2) + (x*x*x*x)/factorial(4) + (x*x*x*x*x*x)/factorial(6) + (x*x*x*x*x*x*x*x)/factorial(8) + (x*x*x*x*x*x*x*x*x*x)/factorial(10) + (x*x*x*x*x*x*x*x*x*x*x*x)/factorial(12);
		return cosh;
	}
	//not finished
	public static double tanh(double a){
		double x = a;
		double tanh = x - (x*x*x)/factorial(3) + 2(x*x*x*x*x)/15 = 17(x*x*x*x*x*x*x)/315
	}
	public static double addTwoNums(double a, double b){
		double x = a;
		double y = b;
		double add = x + y;
		return add;
	}
	public static double subtractTwoNums(double a, double b){
		double x = a;
		double y = b;
		double subtract = x - y;
		return subtract;
	}
	public static double multiplyTwoNums(double a, double b){
		double x = a;
		double y = b;
		double multiply = x * y;
		return multiply;
	}
	public static double divideTwoNums(double a, double b){
		double x = a;
		double y = b;
		double divide = x/y;
		return divide;
	}
	public static double xTenToThe(double a, double b){
		double x = a;
		double y = b;
		double result = a(exponent(10,b));
		return result;
	}
	public static double log(double a, double base){
		double x = a;
		double y = base;
		int power = 0;
		if(a==1){
			return 0;
		}
		else{
			while(true){
				if((exponent(y,power))==x){
					break;
				}
				power++;
			}
			return power;
		}
	}
	
}
