// check number is zero or not
class Duck_Number

{
	public static void main(String[] args) 
	{
		int num= 23005;
		int rem =0;

		while (num>0)
		{
			 rem = num % 10;

			if (rem==0)
			{
				System.out.println("It is Duck number");
				
				break;

			}
			num /=10;

		}
			if(rem!=0)
			{
				System.out.println("It is not Duck number");
			}
		
		
	}
}
