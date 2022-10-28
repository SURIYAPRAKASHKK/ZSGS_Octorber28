package EvaluationOct28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubStringAnagram {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter the Number of Test Cases: ");
		int t = sc.nextInt();
		ArrayList<String> strings = new ArrayList<>(); 
		System.out.println("Enter your Strings:");
		for(int x = 0; x < t; x++) {
			strings.add(sc.next());
		}
		System.out.println("Output: ");
		for(String s: strings)
			System.out.println(pairCount(s));
		
	}
	private static int pairCount(String str) {
		String str1 = "";

		ArrayList<char[]> al = new ArrayList<>();
		for(int si = 0; si < str.length(); si++) {
			str1 = "";
			for(int ei = si; ei <= str.length(); ei++) {
				if(si != ei) {
					str1 += str.substring(si,ei);
					char[] ca = str1.toCharArray();
					Arrays.sort(ca);
					al.add(ca);
					str1 = "";
				}
			}

		}

		ArrayList<String> stringList = new ArrayList<>();
		for(char[] ca: al) {
			String string = "";
			for(char c: ca)
				string += c;

			stringList.add(string);
		}

		//System.out.println(stringList);

		Map<String, Integer> frequency = new HashMap<>();
		int pairCount = 0;

		for(String s: stringList) {
			if(!frequency.containsKey(s))
				frequency.put(s, 1);
			else {
				frequency.put(s, frequency.get(s)+1);
				if(frequency.get(s) == 2)
					pairCount++;
			}
		}
		return pairCount;
	}
}




