package pkg;
import java.util.*;


public class ArrayLists{
	int c = 0;
	public void toStringArrayList(ArrayList<Integer> arr){
		while(true){
			if(c==arr.size()){
				break;
			}
			System.out.println(arr.get(c));
			c++;
			
		}
		return;
	}
	public int getArrayListAverage(ArrayList<Integer> arr){
		c = 1;
		int sum = 0;
		while(true){
			if(c==arr.size()){
				break;
			}
			sum = arr.get(c-1)+arr.get(c);
			c++;
		}
		int average = 0;
		average = sum/arr.size();
		return average;
	}
	public int getArrayListMax(ArrayList<Integer> arr){
		c = 0;
		int max = 0;
		while(true){
			if(c==arr.size()){
				break;
			}
			if(arr.get(c)>max){
				max = arr.get(c);
			}
		}
		return max;
	}
	public int getArrayListMin(ArrayList<Integer> arr){
		c = 0;
		int min = 1000;
		while(true){
			if(c==arr.size()){
				break;
			}
			if(arr.get(c)<min){
				min = arr.get(c);
			}
		}
		return min;
	}
	
}

