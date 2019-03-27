/*
	check if one string is permutation of the other
*/

import java.util.*;
class CheckPermutation{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String testCaseA = sc.next();
		String testCaseB = sc.next();
		System.out.println(isPermutation(testCaseA, testCaseB));

	}

	static boolean isPermutation(String strA, String strB){

		return sort(strA).equals(sort(strB));
	}

	static String sort(String str){

		char strArray[] = str.toCharArray();
		Arrays.sort(strArray);
		return new String(strArray);
	}
		
	
}