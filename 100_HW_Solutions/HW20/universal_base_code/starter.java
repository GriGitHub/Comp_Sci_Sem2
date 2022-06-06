import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		int c = 0;
		while(true){
			if(c==100){
				break;
			}
			int random = rand.nextInt(100)+1;
			arr1.add(random);
			arr2.add(random);
			arr3.add(random);
			c++;
		}
		
		bubbleSort(arr1);
		selectionSort(arr2);
		insertionSort(arr3);
		System.out.println(arr1.get(51));
		System.out.println(arr2.get(51));
		System.out.println(arr3.get(51));
		
	
		
		
		
		
	}
	public static void bubbleSort(ArrayList<Integer> arr){
		for(int outer = 0; outer < arr.size()-1; outer++){
			for(int inner = 0; inner < arr.size()-outer-1; inner++){
				if(arr.get(inner)>arr.get(inner+1)){
					int temp = arr.get(inner);
					arr.get(inner)=arr.get(inner+1);
					arr.get(inner+1)=temp;
				}
			}
		} 
		return;
	
	}
	public static void selectionSort(ArrayList<Integer> arr){
		int outer, inner, key;
		for(outer=1;outer<arr.size();outer++){
			key=arr.get(outer);
			inner = outer - 1;
			while(inner>=0 && arr.get(inner)>key){
				arr.get(inner+1) = arr.get(inner);
				inner = inner - 1;
			}
			arr.get(inner+1) = key;
		}
		return;
	}
	public static void insertionSort(ArrayList<Integer> arr){
		int outer, inner, key;
		for(outer=1; outer < arr.size(); outer++;){
			key = arr.get(outer);
			inner = outer-1;
			while(inner >= 0 && arr.get(inner)>key){
				arr.get(inner+1) = arr.get(inner);
				inner = inner - 1;
			}
			arr.get(inner+1) = key;
		}
		return;
	}
}
