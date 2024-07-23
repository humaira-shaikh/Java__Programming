class Range_Fibonacci 
{
	public static void main(String[] args) 
	{
		
		int start = 10;
		int end = 55;

		int n1 =0;
		int n2 =1, n3;

		

		for (int i=0; i<=end ;i++ )
		{

			if (n1>=start && n1<=end)
			{
			System.out.println(n1);
			}
			n3 = n1+ n2;
			n1 = n2;
			n2 = n3; 

		}
		
	}
}
