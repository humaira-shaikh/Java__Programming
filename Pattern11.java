class Pattern11 
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0; i<n ; i++ )
		{
		for (int j=0; j<n ; j++ )
		{
		if (i+j==n-1 && j<=n/2 || i==j && i>n/2 || i==n-1 )
		{
			 System.out.print("* ");
		}
		else
		{
			System.out.print(" "+" ");
		}
			
		}
		System.out.println();
		
		}
	}
}
