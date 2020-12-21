class nsc2
{
	//NoN-sataic variable
	int a = 50;

	//Non-static method
	public void me()
	{
		int a = 22;
		System.out.println("I am funny local var of nsm me() "+a);
		System.out.println("non static a :"+this.a);

	}

	public void me2()
	{
		//calling nsm method from nsm
		System.out.println("------ Calling nsm  me() from nsm me2() ");
		me();
	}



	public static void main(String[] args) 
	{
		nsc2 obj = new nsc2();
		obj.me2();
	}
}
