class StaticMethod2 
{
	public static void test()
	{
		System.out.println("Static Method 2 Starts");
		System.out.println("Static Method 2 Ends");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		test();
		StaticMethod1.test();
		System.out.println("Main Ends");
	}
}
