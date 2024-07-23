class Check_Fibonacci_Num
{
	public static void main(String[] args) 
	{
		int num = 3;
		int n1 =0, n2=1, n3;
		boolean isFibo = false;

		for (int i=0; i<num ;i++ )
		{
			n3 = n1+ n2;
			if(n1 == num)
			{
				isFibo=true;
				break;
			}
 
			n1 = n2;
			n2 = n3;

		}
		if(isFibo){
			System.out.println(num+" is a fibonacci number !");
		}
		else{
			System.out.println(num+" is not a fibonacci number !");
		}
		
	}
}
