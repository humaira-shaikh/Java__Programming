class Fibonacci 
{
	public static void main(String[] args) 
	{
		int no = 5;
		int n1 =0, n2=1, n3;

		for (int i=0; i<no ;i++ )
		{
			n3 = n1+ n2;
			System.out.println(n1);
			n1 = n2;
			n2 = n3;

		}
		
	}
}
