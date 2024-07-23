import java.util.Scanner;
class NumDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();

		System.out.println("Enter a digit ");
		int digit = sc.nextInt();


		int rev = 0;
		int rem = 0;

		while (num>0)
		{
		 rem = num % 10;

			if (rem == digit)
			{
				System.out.println("The Digit is present in the number ");
				break;
			}
			num /= 10;

		}
		if (rem != digit)
		{
			System.out.println("The digit is not present in the number ");
		}
	}
}
