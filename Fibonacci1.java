class Fibonacci1 
{
	public static void main(String[] args) 
	{
		
		int start = 1;
		int end = 55;
		int n1 =0;
		int n2 =1, n3;
		int count=0;

		

		for (int i=0; i<end ;i++ )
		{
			

			if (n1>=start && n1<=end)
			{
				count++;
			}

			n3 = n1+ n2;
			n1 = n2;
			n2 = n3;
			

		}

		System.out.println("Count of Number: " +count);
		
	}
}
