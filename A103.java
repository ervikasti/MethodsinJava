
class A103 
{
	public static void main(String[] args) 
	{
		System.out.println(isPrime(19));
	}

	public static String isPrime(int num)
	{
		int i=2;

		while(i<num)
		{
			if (num%i==0)
			{
				return "No i am not Prime";
			}
			i++;
		}
			if (i==num)
			{
				return "Yes I am Prime ";
			}
			return" ";
	}
	
}
