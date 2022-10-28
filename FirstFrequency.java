package EvaluationOct28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstFrequency {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter array Length: ");
		int n= sc.nextInt();

		int[] input = new int[n];
		System.out.println("Enter "+n+" Elements : ");
		for(int i = 0; i < n; i++) 
			input[i] = sc.nextInt();

		//int[] A = {1,7,4,7,3,4,8,4,7};
		System.out.println("Enter the K value: ");
		int K = sc.nextInt();
		frequencyMethod(input, K);
	}
	private static void frequencyMethod(int[] A, int K) {
		Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		for(Integer a : A) {
			if(!frequency.containsKey(a)) {
				frequency.put(a, 1);
			}
			else {
				frequency.put(a, frequency.get(a)+1);
				if(frequency.get(a) == K) {
					System.out.println("Output : "+a);
					break;
				}

			}
		}

	}

}
