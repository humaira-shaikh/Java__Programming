class Narrowing1 
{
	public static void main(String[] args) 
	{
		int a = (int)123.123;

		System.out.println(a);

		char ch = (char) 100.33f;
		System.out.println(ch);

		byte i = (byte)385;
		System.out.println(i);
	}
}
