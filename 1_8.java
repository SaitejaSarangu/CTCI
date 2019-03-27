/*
	check if one string is rotation of the other.
*/

import java.util.Scanner;
class RotationCheck{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(checkRotation(s1, s2));
	}

	static boolean checkRotation(String s1, String s2){

		if(s2.length() != s1.length() || s2.length() == 0)
			return false;

		s1 = s1 + s1;
		if(s1.contains(s2))
			return true;
		else return false;
	}
}