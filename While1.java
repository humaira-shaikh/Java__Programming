import java.util.Scanner;
class While1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;

		while(x <= 10)
		{
			 sum = sum + x;
			 x++;
			  
		}
		 System.out.println("Summation: "+sum);
	}
}
