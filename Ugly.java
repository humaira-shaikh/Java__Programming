class Ugly 
{
	public static void main(String[] args) 
	{
		int num = 12;
		while (num>1)
		{
		if (num%2==0)
			num/=2;

		else if(num%3==0)
              num/=3;

		else if(num%5==0)
			num/=5;
		else
			break;
		}

		if (num==1)
		{
		System.out.println("It is an Ugly Number");
		}
		else
		{
			System.out.println("It is beautiful Number");
		}
	}
}
