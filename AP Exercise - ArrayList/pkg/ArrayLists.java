package pkg;
import java.util.*;


public class ArrayLists{
	int c = 0;
	int n = 0;
	public void printArrayList(ArrayList<Integer> arr){
		c = 0;
		while(true){
			if(c==arr.size()){
				break;
			}
			System.out.println(arr.get(c));
			c++;
		}
		return;
	}
	public void addArrayValues(int n, ArrayList<Integer> arr){
		this.n = n;
		c = 0;
		while(true){
			if(c==this.n){
				break;
			}
			arr.add(6);
			c++;
		}
		return;
	}
}
