import java.util.Scanner;
class A105 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("-----  enter a number to check it is STRONG or NOT ----");
		System.out.println(isStrong(s1.nextInt()));
	}

	static String isStrong(int num)
	{
		if(Strong(num) == num)
		{
			return "Yes it is Strong No";
		}
		else
		{
			return "No it is not Strong No";
		}
	}

	//Strong No
	static int Strong(int num)
	{   int sum = 0;

		while(num>0)
		{
			int digit = num%10;
			sum = sum + fact(digit);
			num = num/10;
		}
		return sum;
	}

	//Factorial Method
	static int fact(int digit)
	{
		    int fact = 1;
			while(digit>0)
			{
				fact = fact*digit;
				digit--;
			}
			return fact;
	}

}
