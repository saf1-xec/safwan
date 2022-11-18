package armstrongNumber;

public class ArmstrongMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  number=153;
		int temp;
		int output = 0;
		int rem;
		temp=number;
		
		while (temp!=0) 
		{
			rem=temp%10;
			output=output+(rem*rem*rem);
			temp=temp/10;
		}
		
		if (output==number) {
			System.out.println(number+" is a Armstrong number");
		}
		else {
			System.out.println(number+" is not a Armstrong number");
		}
		
	}

}
