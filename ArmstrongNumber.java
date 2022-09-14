package Armstrong;

public class ArmstrongNumber {
	public static void main(String[] args) {
		 int num= 153;
		 int temp=num;
		 int rem;
		 int output=0;
		while(temp!=0)
		{
			rem=temp%10;
			output+=rem*rem*rem;
			temp=temp/10;
					
		}
		if(output==num) {
			System.out.println("The number is armstrong number");
		}
		else {
			System.out.println("The number is not armstrong number");
		}
}
}
