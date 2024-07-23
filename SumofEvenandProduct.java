class SumofEvenandProduct 
{
	public static void main(String[] args) 
	{
		int num = 684;
		int sum = 0 ;
		int product = 1 ;

		while (num>0)
		{
					int rem = num % 10;
					if (rem%2==0)
					{
						sum += rem;
						
					}
					System.out.println(sum);

					product *= rem;
					
					 num = num / 10;
		}
		if (product==sum)
		{
			System.out.println("Equal Digit!");
		}
		else
		{
			System.out.println("Not Equal!");
		}
				

	}
}
