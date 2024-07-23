import java.util.Scanner;
class Sum_isEqual_num 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		for(int i = 1 ; i <num ; i++){
			if(num % i == 0)
			{
				sum = sum + i;
				
			}
		}
		if (sum==num)
		{
			System.out.println("The sum and num are equal! ");
		}
		else
		{
			System.out.println("The sum and num are not equal! ");
		}
	}
}
