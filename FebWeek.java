import java.util.Scanner;
class FebWeek 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();

		switch(date)
			{
			case 7:
				{
					System.out.println("Rose day");
				}break;
			case 8:
				{
					System.out.println("Propose day");
				}break;

			case 9:
				{
					System.out.println("Chocolate day");
				}break;

			case 10:
				{
					System.out.println("Teddy day");
				}break;

			case 11:
				{
					System.out.println("Promise day");
				}break;

			case 12:
				{
					System.out.println("Hug day");
				}break;

			case 13:
				{
					System.out.println("Kiss day");
				}break;

			case 14:
				{
					System.out.println("Valintines day");
				}break;
			default:
				{
					System.out.println("Invalid Date!!");
				}
		}
		}
}
