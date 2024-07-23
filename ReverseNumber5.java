//sum of all even position digits and product of all odd position digits 
import java.util.Scanner;

class ReverseNumber5
{
	public static void main(String []args)
	{
		int num,reverse=0;
		int sum=0,prod=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		num=sc.nextInt();
		
		while(num > 0)
		{
			int last = num % 10;
			reverse = (reverse * 10 ) + last;
			num = num /10;
		}
		
		num=1;
		while(reverse > 0)
		{
			int digit = reverse % 10;
			if(num % 2==0)
				sum+=digit;
			else
				prod*=digit;
			
			reverse = reverse /10;
			num++;
		}
		
		System.out.println("sum of even positions : "+sum);
		System.out.println("product of odd positions : "+prod);
	}
}