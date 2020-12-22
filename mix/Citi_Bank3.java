class CitiBank3 
{
	String Acc_Name;
	String Acc_Number;
	String Acc_Type;
	final static String Branch_Name="GOREGAON";
	final static String IFSC = "CB0006";
	float bal;
	int pin;
	int loan;


	void payLoan(int amt)
	{
		if (amt>=loan)
		{
			bal = bal + (amt-loan);
			loan = 0;
			System.out.println("Loan Completed");
			System.out.println("Current balance :"+bal);
		}
		else
		{
			loan = loan-amt;
			System.out.println("Due loan amount :"+loan);
		}
	}

	void loan(int amt)
	{
		if (amt<=4*bal)
		{
			loan = amt;
			Manager.accepted();
		}
		else
		{
			System.out.println("Loan Application Rejected");
		}
	}

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

	boolean deposit(int amt, int pin)
	{	
		if (pin == this.pin)
		{
			bal = bal+amt;
			if (Acc_Type.equals("SAVING"))
			{
					if (bal<500)
					{
						bal = amt;
						System.out.println("Pay the amount "+ (500-bal) +" to use the account ");
						System.out.println("Your current amount is :"+ bal);
						return false;
					}
			}
			else if (Acc_Type.equals("CURRENT"))
			{
					if (bal<1000)
					{
						bal = amt;
						System.out.println("Pay the amount "+ (1000-bal) +" to use the account ");
						System.out.println("Your current amount is :"+ bal);
						return false;
					}
			}
			else if (Acc_Type.equals("SALARY"))
			{
					if (bal<5000)
					{
						bal = amt;
						System.out.println("Pay the amount "+ (5000-bal) +" to use the account ");
						System.out.println("Your current amount is :"+ bal);
						return false;
					}
			}
			else 
			{
					if (bal>=0)
					{
						bal = amt;
						System.out.println("Your current amount is :"+ bal);
					}
			}
			return true;

		}
		else
		{
			System.out.println("Entered detail is wrong :");
		}
		return false;
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

	//Parameterised Constructor 
	CitiBank3(String Acc_Name, String Acc_Number, String Acc_Type, int pin)
	{
		this.Acc_Name = Acc_Name;
		this.Acc_Number = Acc_Number;
		this.Acc_Type = Acc_Type.toUpperCase();
		this.pin = pin;
	}


	public static CitiBank3 createAcc(String Acc_Name, String Acc_Number, String Acc_Type, int pin)
	{
		CitiBank3 obj = new CitiBank3(Acc_Name, Acc_Number, Acc_Type, pin);
		System.out.println("---- Account Created -----");
		return obj;
	}

}
