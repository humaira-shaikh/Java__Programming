class Even_Factors 
{
	public static void main(String[] args) 
	{
		int num = 100;

		for(int i = 1 ; i <=num ; i++){
			if(num % i == 0)
			{
				if (i%2==0)
				{
					System.out.println(i);
				}
				
			}
		}
	}
}
