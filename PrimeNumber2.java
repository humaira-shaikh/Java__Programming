class PrimeNumber2 
{
	public static void main(String[] args) 
	{
		int num = 7;
		int den=2;
	for (;den<num/2 ; den++ )
	{
	if(num%den==0)
    {
		break;
    }
	if (den>num/2)
	{
	System.out.println("Prime Number ");
	}
    else 
    {
		System.out.println("Not a Prime No. ");
    }
	}
	}
}
