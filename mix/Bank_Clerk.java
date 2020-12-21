import java.util.Scanner;
class Bank_Clerk 
{
	static
	{
		System.out.println("CITI BANK");
		System.out.println(" --- Welcome ! to CITI Bank Account Creation portal ---");
	}
	public static void main(String[] args) 
	{
		
		Scanner s1= new Scanner(System.in);

		System.out.println("Enter your name :");
		String name = s1.nextLine();

		System.out.println("Enter your Account no :");
		String acc_no = s1.nextLine();

		System.out.println("Enter Account Type :");
		String acc_type = s1.nextLine();

		System.out.println("Enter your pin :");
		int pin = s1.nextInt();

		 CitiBank user = CitiBank.createAcc(name,acc_no,acc_type,pin);

		System.out.println("----   DEPOSIT money to start using  account ----");
		
		System.out.print("Enter Amount :");
		int amt = s1.nextInt();
		System.out.print("Enter Pin :");
		pin = s1.nextInt();
		user.deposit(amt,pin);

		System.out.println("----   Withdraw money Section ----");
		
		System.out.print("Enter Amount :");
		amt = s1.nextInt();
		System.out.print("Enter Pin :");
		pin = s1.nextInt();
		user.withdraw(amt,pin);

		//Display account info
		System.out.println("----   Account Info Section ----");
		
		System.out.println("Enter Pin :");
		pin = s1.nextInt();
		user.display(pin);






	}
}
