import java.util.Scanner;
class Timetable 
{
	public static void main(String[] args) 
	{
		System.out.println("days in week");
		Scanner sc=new Scanner(System.in);
		String Day=sc.next();
		
		switch (Day)
		{
		case "Monday":
			{
				System.out.println("java full stack");
				break;
			}
		case "Tuesday":
			{
				System.out.println("HTML,CSS,JS");
				break;
			}
			case "Wenesday":
			{
				System.out.println("web services");
				break;
			}
		
		case "Thursday":
			{
				System.out.println("data science");
				break;
			}
		
		case "Friday":
			{
				System.out.println("sql");
				break;
			}
		case "Saturday":
			{
				System.out.println("core java");
				break;
			}
			case "Sunday":
			{
				System.out.println("Practice /revision");
				break;
			}
		default:
			{
				System.out.println("go somewhere you want to go...");
				
			}
		
		
		
		}
	}
}
