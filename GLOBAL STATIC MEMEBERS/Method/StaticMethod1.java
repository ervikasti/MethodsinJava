class StaticMethod1 
{
	public static void test()
	{
		System.out.println("Static Method Starts");
		System.out.println("Static Method Ends");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		test();
		System.out.println("Main Ends");
	}
}
