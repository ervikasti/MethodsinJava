class NSV1 
{
	int  a;
	public static void main(String[] args) 
	{
		NSV1 obj1 = new NSV1();
		System.out.println(obj1.a);
		obj1.a = 20;

		//Creating another object
		NSV1 obj2 = new NSV1();
		System.out.println("Objecct 1: "+obj1.a);
		System.out.println(obj2.a=30);
	}
}
