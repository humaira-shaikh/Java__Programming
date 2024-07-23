class Ugly_Number_Range {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        //System.out.println("Ugly numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            int num = i;

	 while(num>1)
	{          
            if (num % 2 == 0) 
                num /= 2;  
            else if (num % 3 == 0) 
                num /= 3;
            else if (num % 5 == 0) 
                num /= 5;
	     else
		break;
	}
            if (num==1) {
                System.out.println(i + " ");
            }
        }
    }
}
