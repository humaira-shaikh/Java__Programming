//count of even & odd digit number 
import java.util.Scanner;

class ReverseNumber7
{
	public static void main(String []args)
	{
		int num;
		int odd_count=0;
		int even_count=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		num=sc.nextInt();
		
		while(num > 0)
		{
			if(num%2==0)
				{
				System.out.println(even_count);
				even_count++;
			}
			else
			{
				System.out.println(odd_count);
				odd_count++;
			}
			
		}
		
		
	}
}