class Library 
{
	String sname;
	int rollno;
	int std;
	static int count;

	//constructor for New Student
	public Library(String sname)
	{
		this.sname=sname;
		std = 1;
		rollno = ++count;
		System.out.println("Your Rollno is   :"+rollno);
	}
	//Constructer for Old Student
	public Library(String sname,int rollno,int std)
	{
		this.sname = sname;
		this.rollno = rollno;
		this.std = std;

	}

	void display(int rollno)
	{
		if (this.rollno == rollno)
		{
			System.out.println("Name     :"+sname);
			System.out.println("Rollno   :"+rollno);
			System.out.println("Standard :"+std);
		}
		else
		{
			System.out.println("Wrong Rollno Number");
		}
	}

		public static Library createAcc(String sname)
		{
				Library newStudent = new Library(sname);
				System.out.println(" --- Library Account Created Suceesfully ---"); 
				return newStudent;
		}


		public static Library createAcc(String sname,int rollno, int std)
		{
				Library oldStudent = new Library(sname,rollno,std);
				System.out.println(" --- Library Account Created Suceesfully ---"); 
				return oldStudent;
		}


}
