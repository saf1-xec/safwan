package Factorial;

public class Facttorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numberInteger=1;
		
		int factorial=facto(numberInteger);
		System.out.println(factorial);
		
	}
	
	public static int facto(Integer n)
	{
		if(n>1)
			return (n*facto(n-1));
		
		return 1;
		
	}
}
