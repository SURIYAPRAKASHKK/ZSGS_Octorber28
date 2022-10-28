package EvaluationOct28;

import java.util.Scanner;

public class ArrayLeader {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter array Length: ");
		int n= sc.nextInt();

		int[] input = new int[n];
		System.out.println("Enter "+n+" Elements : ");
		for(int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		//int[] input = {16,17,4,3,5,2};
		arrayLeads(input);
	}
	private static void arrayLeads(int[] input) {
		for(int i = 0; i < input.length-1; i++) {
			boolean hasBigger = false;
			for(int j = i+1; j < input.length; j++) {
				if(input[i] <= input[j]) {
					hasBigger = true;
				}
			}
			if(!hasBigger) {
				System.out.print(input[i] +"  ");
			}

		}
		System.out.print(input[input.length-1]);
	}


}

