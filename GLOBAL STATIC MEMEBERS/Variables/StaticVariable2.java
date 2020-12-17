class StaticVariable2 
{
	static int a;
	public static void main(String[] args) 
	{
		int a = 20;
		System.out.println("Local Variable  "+a);
		System.out.println("Global Static Variable  "+StaticVariable2.a);
	}
}
