class Pattern9 
{
	public static void main(String[] args) 
	{
		int n=16;
		for (int i=0; i<n ; i++ )
		{
			for (int j=0; j<i ; j++ )
		{
			System.out.print(" ");
		}
		for (int star=0 ;star<=n-i*2 ; star++ )
		{
			System.out.print("*");
		}
			System.out.println();

		}
		
		
	}
}
