class A101
{
	public static void main(String[] args) 
	{
		System.out.println("The Program will Print Method");
		System.out.println("Output from 2 integer method "+add(10,20));
		System.out.println("Output from 3 integer method "+add(10,20,30));
		System.out.println("Output from 2 integer and 1 float method "+add(10,20,30.0f));
		System.out.println("Output from 3 float method "+add(10.0f,20.0f,30.0f));
		System.out.println("Output from 2 integer and 2 float method "+add(10,20,30.f,40.0f));
	}

	public static int add(int a,int b)
	{	
		return a+b;
	}

	public static int add(int a,int b, int c)
	{
		return a+b+c;
	}

	public static float add(int a,int b, float c)
	{
		return a+b+c;
	}

	public static float add(float a,float b, float c)
	{
		return a+b+c;
	}

    public static float add(int a,int b, float c, float d)
	{
		return a+b+c+d;
	}
}
