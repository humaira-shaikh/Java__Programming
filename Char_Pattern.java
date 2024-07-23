class Char_Pattern 
{
	public static void main(String[] args) 
	{
		char ch = 'b';
		for (int i=0; i<4 ;i++ )
		{
			
			for (int j=0;j<4 ;j++ )
			{
				
				System.out.print(ch + " ");
				ch+=2;
				
				if(ch>='y')
					ch = (char)'b';

			}
			System.out.println();
		}
	}
}
