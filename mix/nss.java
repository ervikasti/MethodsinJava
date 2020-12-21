class nss 
{
	public void me()
	{
		System.out.println("Hello from Non-Static Method");
	}

	public static void main(String[] args) 
	{
		nss obj = new nss();
		obj.me();
		
	}
}
