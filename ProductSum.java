class ProductSum 
{
	public static void main(String[] args) 
	{
		int num =600;
		int sum = 0;
		int product =1;

		while (num>0)
		{
			int rem = num %10;
			sum = sum + rem;
			product = product * rem;

			num = num / 10;
		}
		if (num == product)
		{
			System.out.println("Perfect Digit");
		}
		else
		{
			System.out.println("Not Perfect Digit");
		}
	}
}
