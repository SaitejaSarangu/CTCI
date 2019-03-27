/*
	Replace spaces in  strings with '%20'
*/
import java.util.*;
class StringMani{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String testCase = sc.nextLine();
		int length = testCase.length();
		String res = testCase.replace(" ", "%20");
		System.out.println(res);
		print(mani(testCase, length));

	}

	static void print(String str){

		System.out.println(str);
	}
	//Using character array
	static String mani(String str, int length){

		int spaceCount = 0;
		for(int i = 0; i < length; i++)
			if(Character.isWhitespace(str.charAt(i)))
				spaceCount++;
		int newLength = length + spaceCount * 2;
		char strNew[] = new char[newLength+1];
		strNew[newLength--] = '\0';
		for(int i = length-1; i >= 0; i--){

			if(str.charAt(i) == ' '){

				strNew[newLength--] = '0';
				strNew[newLength--] = '2';
				strNew[newLength--] = '%';
			}
			else{
				strNew[newLength--] = str.charAt(i);
			}
		}
		return new String(strNew);
	}
}