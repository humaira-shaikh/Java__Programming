import java.util.Scanner;
class ifElse3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an alphabet: ");
		char ch = sc.next().charAt(0);

		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
			System.out.println("It is an alphabet! ");
		}
		else
		{
			System.out.println("Not an alphabet ");
		}
	
	}
}
