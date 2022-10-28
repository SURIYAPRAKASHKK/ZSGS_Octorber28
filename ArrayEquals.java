package EvaluationOct28;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayEquals {

	public static void main(String[] args) {

		int[] A = {1,2,5,4,0};
		int[] B = {2,4,5,0,1};
		
		
		ArrayList<Integer> AList = new ArrayList<>();
		ArrayList<Integer> BList = new ArrayList<>();
		
		for(int a: A) {
			AList.add(a);
		}
		for(int b: B)
			BList.add(b);
		
		if(AList.size() == BList.size()) {
			Collections.sort(AList);
			Collections.sort(BList); 
		}
		
		
		System.out.println(AList);
		System.out.println(BList);
		
		System.out.println(AList.equals(BList));
		
		
	}

}
