package Palindrome;


public class Palindorme {

	public static void main(String[] args) {
		String original="safi";
		String tempString="";
		
		Integer len=original.length();
		for(int i=(len-1);i>=0;--i )
		{
		
			tempString=tempString+original.charAt(i);
			
		}
		if (original.toLowerCase().equals(tempString.toLowerCase())) {
			System.out.println(original+" is palindrome");
		}
		else {
			System.out.println(original+" is not a palindrome");
		}
		System.out.println(tempString);
	}

}
