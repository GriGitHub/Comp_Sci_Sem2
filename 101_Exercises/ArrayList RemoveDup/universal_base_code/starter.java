
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void removeDup(ArrayList<Integer> arr){
		int c = 0;
		while(true){
			if(c==arr.size()){
				break;
			}
			int d = c+1;
			while(true){
				if(d==arr.size()){
					break;
				}
				if(arr.get(c)==arr.get(d)){
					arr.remove(d);
				}
				d++;
			}
		c++;
		}
	}
}
