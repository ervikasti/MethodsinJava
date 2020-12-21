class sns 
{
	//Static variable
	static int a = 50;
	//Staic method
	static void me()
	{ 
		int b=20;
		System.out.println("Hello From BOB_THE_BUILDER static Method");
		System.out.println("Calling STATIC variable directly from static method");
		System.out.println("Hello World! i am static varible "+sns.a);
		System.out.println("Hello World! local varible "+b);
	}

	//NON sataic Method
	public void me2()
	{
		System.out.println("Hello from non static method I am gona calling Static method");
		sns obj = new sns();
		obj.me();
		System.out.println(" --  calling Static variable via object "+obj.a);

	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		sns obj2 = new sns();
		obj2.me2();
	}
}
