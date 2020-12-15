
class A102 
{
	public static int addition(int... num)
		{   int sum = 0;
			 for (int i=0;i<num.length ;i++ )
			 {
				 sum = sum+num[i];
			 }
			return sum;
	    }

	public static int subtarct(int... num)
		{   int diff = num[0];
			 for (int i=1;i<num.length ;i++ )
			 {
				 diff = diff-num[i];
			 }
			return diff;
	    }

	public static int multiplication(int... num)
		{   int mul = 1;
			 for (int i=0;i<num.length ;i++ )
			 {
				 mul = mul*num[i];
			 }
			return mul;
	    }

	public static void main(String[] args) 
	{
		System.out.println(addition(10,20));
		System.out.println(subtarct(10,20));
		System.out.println(multiplication(10,20));
	}

		public static void main(int[] args) 
	{
		System.out.println(addition(10,20));
		System.out.println(subtarct(10,20));
		System.out.println(multiplication(10,20));
	}
}
