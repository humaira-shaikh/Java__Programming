class Strong 
{
	public static void main(String[] args) 
	{
		int num = 3;
		int sum =0;
	
        while(num!=0)
		{
			int rem = num%10;
			int fact =1;

		for (int i=0; i>0 ;i-- )
		{
			fact = fact * i;
		}
		sum += fact;
		num /= 10;
		}
		if (num==sum)
		{
		System.out.println("Is is an Strong ");
		}
		else
		{
			System.out.println("It is not an Strong");
		}
	}
}
