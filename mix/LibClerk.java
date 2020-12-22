import java.util.Scanner;
class LibClerk
{
	static Library stu;
	static boolean check;
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("    --- WELCOME ! ---");
		System.out.println("Are you new student if Yes type  "+"Y"+"  or type  "+"N");
		String student = s1.next();
		s1.nextLine();
		
		switch (student)
		{
		case "Y": System.out.println("Enter your name dear");
					LibClerk.stu = Library.createAcc(s1.nextLine());
					LibClerk.check = true;
					break;

		case "N":   System.out.println("Enter your name dear");
					String name = s1.nextLine();
					System.out.println("Enter your rollno");
					int rollno = s1.nextInt();
					System.out.println("Enter your std");
					int std = s1.nextInt();
					LibClerk.stu = Library.createAcc(name,rollno,std);
					LibClerk.check = true;
					break; 

		default : System.out.println("Wrong Detail");					
		}
		
		if (check)
		{
			System.out.println(" ---  Library Account Details --- ");
			System.out.println(" Enter your Rollno ");
			stu.display(s1.nextInt());
		}
		
		

	}
}
