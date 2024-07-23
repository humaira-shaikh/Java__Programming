class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int num =8;
		int den=2;
	for (;den<num ;den++ )
	{
	if (num%den==0)
	{
		break;
	}
	}
    if (num==den)
    {
      System.out.println("It is a Prime Number. ");
    }
    else 
    {
		System.out.println("Not a Prime No. ");
    }
	}
}
