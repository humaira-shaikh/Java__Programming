class Pattern10 
{
	public static void main(String[] args) 
	{
		int n=4;
		for (int i=0; i<n ; i++ )
		{
			for (int space=0 ; space<i ;space++ )
			{
				System.out.print(" ");
			}
			for (int star=0 ; star<=2*i ; star++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
