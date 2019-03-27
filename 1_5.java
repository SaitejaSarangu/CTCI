/*
	string compression
*/
import java.util.*;
class StringCompress{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(compressor(str));
	}

	public static String compressor(String str){
		if(lenCheck(str) >= str.length())
			return str;
		StringBuffer cmpstr = new StringBuffer();
		int count = 1;
		char last = str.charAt(0);
		for(int i = 1; i < str.length(); i++){

			if(str.charAt(i) == last)
				count++;

			else{
				cmpstr.append(last);
				cmpstr.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		cmpstr.append(last);
		cmpstr.append(count);
		return(cmpstr.toString());
	}

	public static int lenCheck(String str){
		int len = 0, count = 1;
		char last = str.charAt(0);
		for(int i = 1; i < str.length(); i++){

			if(str.charAt(i) == last)
				count++;

			else{
				
				len += 1 + String.valueOf(count).length();	
				last = str.charAt(i);
				count = 1;
			}
		}
		len += 1 + String.valueOf(count).length();	
		return len;
	}
}