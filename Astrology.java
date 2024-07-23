import java.util.Scanner;
class Astrology 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the day you want to wear which colour");
		Scanner sc=new Scanner(System.in);
		String colour=sc.next();

		switch(colour)
		{
		case "Monday":
			{
				System.out.println("White");
				break;
			}
		case "Tuesday":
			{
				System.out.println("Red");
				break;
			}
			case "Wenesday":
			{
				System.out.println("green");
				break;
			}
		
		case "Thursday":
			{
				System.out.println("yellow");
				break;
			}
		
		case "Friday":
			{
				System.out.println("pink");
				break;
			}
		case "Saturday":
			{
				System.out.println("black");
				break;
			}
			case "Sunday":
			{
				System.out.println("orange");
				break;
			}
		default:
			{
				System.out.println("what u want you can wear...");
				
			}
		
		
		}
		}
	}
