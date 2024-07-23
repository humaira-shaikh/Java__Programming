//sum of all even position digits and sum of all odd position digits is equal or not 
import java.util.Scanner;

class ReverseNumber6
{
	public static void main(String []args)
	{
		int num,reverse=0;
		int evenSum=0,oddSum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		num=sc.nextInt();
		
		//reverse number to get starting odd value 
		while(num > 0)
		{
			int last = num % 10;
			reverse = (reverse * 10 ) + last;
			num = num /10;
		}
		
		//start from the fisrt odd value 
		
		num=1;
		while(reverse > 0)
		{
			int digit = reverse % 10;
			if(num % 2==0)
				evenSum+=digit;
			else
				oddSum+=digit;
			
			reverse = reverse /10;
			num++;
		}
		
		System.out.println("sum of even positions : "+evenSum);
		System.out.println("sum of odd positions : "+oddSum);
		if(evenSum == oddSum)
			System.out.println("equal");
		else
			System.out.println("not equal");
			
	}
}