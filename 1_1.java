/*
	check if string has unique characters
*/

import java.util.Scanner;
class UniqueString{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String testCase = sc.next();
		int val[] = new int[256];
		boolean flag = true;
		for(int i = 0; i < testCase.length(); i++){

			if(val[testCase.charAt(i)] == 1){

				flag = false;
				break;
			}
		
		val[testCase.charAt(i)] = 1;
		}

		System.out.println(flag);
	}
}