class Logical1  
{
	public static void main(String[] args) 
	{
		int a=6, b=8, c=10, d;
//1
		d = a++ + c-- + b;
		a = -c++ + a-- - ++b;
		b = b + a + d + c;
		c = --a + c++ - d++; 

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		//System.out.println(" ");
//2
		// a =  -a + b-- + c-- + d;
		//b =  ++b + c-- - d - --a;
		//c =  c++ - b++ + ++d + a;
		//d =  --d + a++ - c++ - b;
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);
		 

	}
}
