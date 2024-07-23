import java.util.Scanner;
class While 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number");
		int start = sc.nextInt();

		System.out.println("Enter the last Number");
		int end = sc.nextInt();
		
		System.out.println("Range: ");
		while(start<=end)
		{
			
			System.out.println(start);
			 start++;
		}
	}
}
