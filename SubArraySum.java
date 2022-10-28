package EvaluationOct28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubArraySum {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//int[] A = {15,-2,2,-8,1,7,10,23};
		
		System.out.print("Enter array Length: ");
		int n= sc.nextInt();

		int[] input = new int[n];
		System.out.println("Enter "+n+" Elements : ");
		for(int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		System.out.println("Maximum SubArray Length is "+subArrayLength(input));
		
	}
		private static int subArrayLength(int[] input) {
		ArrayList<Integer> track = new ArrayList<>();
		for(int i = 0; i < input.length; i++) {
			int sum = 0;
			sum += input[i];
			for(int j = i+1; j < input.length; j++) {
				sum += input[j];
				if(sum == 0) {
					track.add((j-i)+1);
				}
				
			}
		}
		return Collections.max(track);
	}

}
