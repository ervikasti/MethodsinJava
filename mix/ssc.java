class ssc 
{
	public static void me()
	{
		System.out.println("Hello from STATIC Method");
	}

	public static void main(String[] args) 
	{
		me(); //directly
		ssc.me(); // using class name
		ssc obj = new ssc();
		obj.me(); //using object 
	}
}
