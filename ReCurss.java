package Armstrong;

public class ReCurss {
	public static void main(String[] args) {
		 int number=0;
		
		 int factorial=facto(number);
		 System.out.println(factorial+" is the factorial of "+number);
		 
		 
}

	
	public static int facto(int n) {
		if(n>1)
			return(n*(facto(n-1)));
		return 1;
	}
	
	
}
