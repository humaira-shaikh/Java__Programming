class SumofRange 
{
	public static void main(String[] args) 
	{
		int start =1;
		int end = 20;
		int sum = 0;

		while (start<=end)
		{
			sum = sum + start;
			start++;
			
		}
		System.out.println(sum);
	}
}
