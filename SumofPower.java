class SumofPower 
{
	public static void main(String[] args) 
	{
		int num =12;
        int sum =0;
	while (num!=0)
	{
		int rem = num%10;
        int pow =1;

	for (int i=0; i<3 ;i++)
	{
	pow = pow*rem;
	}
        sum = sum + pow;
		num/=10;
	}
    System.out.println(sum);
	}
}
