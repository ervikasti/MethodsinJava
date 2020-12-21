class CitiBank 
{
	String Acc_Name;
	String Acc_Number;
	String Acc_Type;
	final static String Branch_Name="GOREGAON";
	final static String IFSC = "CB0006";
	float bal;
	int pin;

	void withdraw(int amt, int pin)
	{	
		if (pin == this.pin && amt<=bal && bal-amt>=500 && amt<10000 && amt%10==0)
		{
			bal = bal-amt;
		}
		else
		{
			System.out.println("Detailed enter is wrong");
		}
	}

	void deposit(int amt, int pin)
	{	
		if (pin == this.pin)
		{
			bal = bal+amt;

			if (bal<500)
			{
				bal = amt;
				System.out.println("Pay the amount "+ (500-bal) +" to use the account ");
				System.out.println("Your current amount is :"+ bal);
			}
		}
		else
		{
			
			
		}
	}

	void display(int pin)
	{	
		if (pin == this.pin)
		{
			System.out.println("Acc_Name  : "+Acc_Name);
			System.out.println("Acc_No.   : "+Acc_Number);
			System.out.println("Acc_Type  : "+Acc_Type);
			System.out.println("Branch    : "+CitiBank.Branch_Name);
			System.out.println("IFSC      : "+CitiBank.IFSC);
			System.out.println("Balance   : "+bal);
		}
		else
		{
			System.out.println("Incorrect Pin");
		}
	}

	public static CitiBank createAcc(String Acc_Name, String Acc_Number, String Acc_Type, int pin)
	{
		CitiBank obj = new CitiBank();
		obj.Acc_Name = Acc_Name;
		obj.Acc_Number = Acc_Number;
		obj.Acc_Type = Acc_Type;
		obj.pin = pin;

		System.out.println("---- Account Created -----");

		return obj;
	}

}
