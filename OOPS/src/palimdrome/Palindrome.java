package palimdrome;

public class Palindrome {

	public static void main(String[] args) {
		String originalString="Radar";
		String tempString="";
		Integer len=originalString.length();
		for(int i=(len-1);i>=0;--i)
		{
			tempString=tempString+originalString.charAt(i);
		}
		if (originalString.toLowerCase().equals(tempString.toLowerCase())) {
			System.out.println("Its a palindrome");
		} else {
			System.out.println("Its not a palindrome");
		}
	}	
}
