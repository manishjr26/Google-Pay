package practice.com;

public abstract class Google_Pay 
{
	abstract void balance();
	abstract void transfer();
}

class UserDetails1
{ 		String userName;long userCheck2,userPin2;
	static void details1()
	{
		System.out.println("\tYour Supposed to Validate Account to Continue ");
		System.out.println("\tEnter your Good Name  : ");
		java.util.Scanner n=new java.util.Scanner(System.in);
		String userName=n.next();phoneNumber1(userName);
		//Number nu=new Number();
		//nu.phoneNumber();
	}

	static void phoneNumber1(String userName)
	{
		System.out.println("\n\tEnter your phone number");
		java.util.Scanner num=new java.util.Scanner(System.in);
		long userNumber=num.nextLong();
		//if(userName.equals())
		int count=0;
		long userCheck=userNumber; 
		long userCheck2=userNumber;
		//this.userCheck2=userCheck2;
		long firstDigit = 0;

		while(userCheck!=0) // To check if number contains 10 digit
		{
  			count++;
  			userCheck/=10;
		}
		if(count==10)
		{
          while(userNumber!=0)  // To Check Starting digit of the number
          {
             firstDigit=Math.abs(userNumber % 10);
             userNumber/=10;
          }

		}else if(count!=10)
		{  // If number does'nt contain 10 digit again the process continues by taking a 10 digit number
  				System.err.println("   		\nPhone Number Entered Not Valid");
  				System.out.println("  \t Enter Valid 10 digit Phone  Number Again -");
  				phoneNumber1(userName);
		}
		if(firstDigit==9 || firstDigit==8|| firstDigit==7)
		{
			System.out.println("\t\t\t$========================================================================$\t\t\t");
  				System.out.println("\t\t\t@\t Your entered number contains 10 digits and it starts with "+firstDigit+"\t @" );
  				System.out.println("\t\t\t#\t      So, its valid India Regristration Number.\t\t\t # ");
  				System.out.println("\t\t\t$\t======== Therefore ,Phone Number Validation Successfull.======== $\t");
  				//System.out.println("\t\t\t@           =====    Account Validation Successfull.  ======= \t\t @");
  				System.out.println("\t\t\t#========================================================================#\t\t\t");
  				userPin(userName,userCheck2);
  				//ATMChoice ac=new ATMChoice();
  				//ac.choice();
  		}

		else if(firstDigit==1 || firstDigit ==2 || firstDigit==3||firstDigit==4||firstDigit==5||firstDigit==6||firstDigit==0)
		{
  				System.err.println(" \nEntered Number contains 10 digits but it does'nt start with\n 9 or 8 or 7 to confirm that number belongs to India Regristration.  ");
  				System.out.println("\n");
  				System.out.println(" Enter Valid 10 digit Phone  Number Again -");
  				phoneNumber1(userName);
		}
	}
	static void userPin(String userName,long userCheck2)
	{
		System.out.println(" \n\tEnter 6 digit pin .");
		java.util.Scanner mr14=new java.util.Scanner(System.in);
		long userPin1=mr14.nextLong();int count=0; long userPin2=userPin1; 
		while(userPin1>0)
		{
			count++; userPin1/=10;
		}
		if(count==6)
		{
			System.out.println(" \n\t\t                \" Pin contains 6 digits. \" ");
			System.out.println(" \t\t\" Remember your credentials what you entered for further process .\"");
			validation(userName,userCheck2,userPin2);
		}else if(count!=6)
			userPin(userName,userCheck2);
	}
	static void validation(String userName,long userCheck2,long userPin2)
	{
	System.out.println(" \n Enter your name, number and 6 digit pin to confirm your credentials .");
	System.out.println(" \n\tEnter your name ");
	java.util.Scanner mr2=new java.util.Scanner(System.in);
	String nameConfirm=mr2.nextLine();
	System.out.println(" \n\tEnter your number ");
	java.util.Scanner mr3=new java.util.Scanner(System.in);
	long numberConfirm=mr3.nextLong();
	System.out.println(" \n\tEnter your pin ");
	java.util.Scanner mr1=new java.util.Scanner(System.in);
	long pinConfirm=mr1.nextLong();
		if(userPin2==pinConfirm && nameConfirm.equals(userName) && userCheck2==numberConfirm)
		{
			    System.out.println("\t\t$ ===   Hurry   =================   Hurry   =====================   Hurry   ===================$\t\t\t\t");
				System.out.println("\t\t@\t      - - - - - - - -      You have entered correct details .   ------------           @\t\t\t\t" );
				System.out.println("\t\t#\t        ! ! ! ! ! ! !       It matches with User Details.       ! ! ! ! ! !            #\t\t\t\t");
				System.out.println("\t\t#\t          + + + + + +    Credentials Successfully Validated .   + + + + +              #\t\t\t\t");
				System.out.println("\t\t@\t          ( ) ( )         Account Validation Successfull.       ( ) ( )                @\t\t\t\t");
				System.out.println("\t\t$ =============    Hurry    =================    Hurry      =================   Hurry==========$\t\t\t\n");
			FactoryClass fc=new FactoryClass();
			fc.choice();
		}else 
		{
			java.util.Scanner mr4=new java.util.Scanner(System.in);
			System.err.println(" \tEntered Credentials are invalid. What do you wish to do ? ");
			System.out.println(" \t\t 1 - Do you wish to validate your Credentials Again\n\t\t 2 - Login from begin "); 
			int userLogin=mr4.nextInt();
			if(userLogin==1) 
			{
				validation(userName,userCheck2,userPin2);
			}else
			{
				details1();	
			}
		}
	}
}

class ICICI extends Google_Pay
{	double iciciBalance=15000.0;
	void welcomeICICI() 
	{
		System.out.println("\t\t\t$==$ =$= $= $          Welcome to ICICI Bank.             $ =$ =$= $==$ ");
		System.out.println("\t\t\t     =$= $= $    We are there, for your every thought!    $ =$ =$= ");
		System.out.println(" \t What transcation do you wish to do :\n\t1-Check Balance\n\t2-Do Transcation");
		System.out.println("\tEnter your choice");
		java.util.Scanner mr1=new java.util.Scanner(System.in);
		int userICICI=mr1.nextInt();
		if(userICICI==1) 
		{
			balance();
		}else if(userICICI==2) 
		{
			transfer();
		}else 
		{System.err.println(" \t\t\t\t   Invalid Choice .  \n\t\t\t\t     Try Again . ");
			 welcomeICICI();
		}
	}
	void balance()
	{
		System.out.println(" Your Present Balance is : "+ iciciBalance);thankYou1();
	}
	
	void transfer()
	{
		System.out.println(" \t\t\t=== = == Enter the money you wish to Transfer . == = ===");
		 java.util.Scanner mr1=new java.util.Scanner(System.in);
		 double iciciWithDraw=mr1.nextDouble();
		 if(iciciWithDraw<iciciBalance)
		 {
			 System.out.println("Enter the receiver number \n");
			 java.util.Scanner mr3=new java.util.Scanner(System.in);
			 long receiveNum=mr3.nextLong();
			 double accountBalance=iciciBalance-iciciWithDraw;
			 System.err.println(" You Transfered :" +iciciWithDraw+" amount to number : "+receiveNum);
			 System.out.println(" Amount Present in account after with draw :"+accountBalance);thankYou1();
		 }else
		 {	 System.err.println(" \t\tYou entered amount is greater than Balance. \n\t\t     So transcations not successful . ");
			 System.out.println(" \nDo you want to try transcation again . \n\t Y - To initiate transcation again \t I - Go back to ICICI Account . \t M - Main Page . \n");
			 java.util.Scanner mr=new java.util.Scanner(System.in);
			 char transcation=mr.next().charAt(0); 
			 if(transcation=='Y')
			 {
				 transfer();
			 }else if(transcation=='I')
			 {
				 welcomeICICI();
			 }
			 else if(transcation=='M')
			 {
				 FactoryClass fc=new FactoryClass();
			 		fc.choice();
			 }
			 		else
			 		{
			 			System.err.println(" \t\t\t\t   Invalid Choice .  ");
			 			System.out.println(" \t\t\t\t  See you next time . ");
			 			System.exit(0);
			 		}
			 
		 }
			 
	}
			
	void thankYou1()
	{
		for(int i=1;i<=5;i++)
		{
				System.out.print(" * ");
		}
			
		System.out.println(" \" Thank You for using ICICI Bank for Google Pay Payment . \" .$  $  $  $  $ ");
		System.exit(0);
		
	}
}

class SBI extends Google_Pay
{
	double sbiBalance=20000.0;
	void welcomeSBI() 
	{
		System.out.println(" \t#==# #=# == #       Welcome to SBI.         # == #=# #==# ");
		System.out.println(" \t     #=# == #   We Understand Your World!   # == #=# ");
		//ring name=userName;
		//stem.out.println("Your Name is :"+
		System.out.println(" \t What transcation do you wish to do :\n\t1-Check Balance\n\t2-Do Transcation");
		System.out.println("\tEnter your choice");
		java.util.Scanner mr1=new java.util.Scanner(System.in);
		int userSBIChoice=mr1.nextInt();
		if(userSBIChoice==1) 
		{
			balance();
		}else if(userSBIChoice==2) 
		{
			transfer();
		}else 
		{System.err.println(" \t\t\t\t   Invalid Choice .  \n\t\t\t\t     Try Again . ");
			welcomeSBI();
		}
	}
	@Override
	void balance()
	{
		System.out.println(" Your Present Balance is : "+ sbiBalance);
		thankYou1();
	}
	@Override
	void transfer()
	{
		System.out.println(" \t\t\t=== = == Enter the money you wish to Transfer . == = ===");
		 java.util.Scanner mr1=new java.util.Scanner(System.in);
		 double sbiWithDraw=mr1.nextDouble();
		 if(sbiWithDraw<sbiBalance)
		 {
			 System.out.println("\nEnter the receiver number ");
			 java.util.Scanner mr3=new java.util.Scanner(System.in);
			 long receiveNum=mr3.nextLong();
			 double accountBalance=sbiBalance-sbiWithDraw;
			 System.err.println(" You Transfered :" +sbiWithDraw+" amount to number : "+receiveNum);
			 System.out.println(" Amount Present in account after with draw :"+accountBalance);thankYou1();
		 }else
		 {	 System.err.println(" \t\tYou entered amount is greater than Balance. \n\t\t     So transcations not successful . ");
			 System.out.println(" \nDo you want to try transcation again . \n\t Y - To initiate transcation again \t I - Go back to SBI Account . \t M - Main Page . \n");
			 java.util.Scanner mr=new java.util.Scanner(System.in);
			 char transcation=mr.next().charAt(0); 
			 if(transcation=='Y')
			 {
				 transfer();
			 }else if(transcation=='I')
			 {
				 welcomeSBI();
			 }
			 else if(transcation=='M')
			 {
				 FactoryClass fc=new FactoryClass();
			 		fc.choice();
			 }
			 else
			 		{
			 			System.err.println(" \t\t\t\t   Invalid Choice .  ");
			 			System.out.println(" \t\t\t\t  See you next time . ");
			 			System.exit(0);
			 		}
			 
		 }
	}
	void thankYou1()
	{
		for(int i=1;i<=5;i++)
		{
				System.out.print(" # ");
		}
			
		System.out.println(" \" Thank You for using SBI Bank for Google Pay Payment . \" $  $  $  $  $ ");
		System.exit(0);
		
	}
	
}

class HDFC extends Google_Pay
{
	double hdfcBalance=10000.0;
	void welcome()
	{
		System.out.println("\t @==@ @=@ @= @     Welcome to HDFC Bank .     @ =@ @=@ @==@ ");
		System.out.println("\t      =@= =@ =   We Understand Your World!    = @= =@= ");
		System.out.println(" \t What transcation do you wish to do :\n\t1-Check Balance\n\t2-Do Transcation");
		System.out.println("\tEnter your choice");
		java.util.Scanner mr1=new java.util.Scanner(System.in);
		int userHDFCChoice=mr1.nextInt();
		if(userHDFCChoice==1)
		{
			balance();
		}else if(userHDFCChoice==2)
		{
			transfer();
		}else
		{System.err.println(" \t\t\t\t   Invalid Choice .  \n\t\t\t\t     Try Again . ");
			welcome();
		}
	}
	@Override
	void balance() 
	{
		System.out.println(" Your Present Balance is : "+ hdfcBalance);
		thankYou1();
		
	}

	@Override
	void transfer() 
	{
		System.out.println(" \t\t\t=== = == Enter the money you wish to Transfer . == = ===");
		 java.util.Scanner mr1=new java.util.Scanner(System.in);
		 double hdfcWithDraw=mr1.nextDouble();
		 if(hdfcWithDraw<hdfcBalance)
		 {
			 System.out.println("\nEnter the receiver number ");
			 java.util.Scanner mr3=new java.util.Scanner(System.in);
			 long receiveNum=mr3.nextLong();
			 double accountBalance=hdfcBalance-hdfcWithDraw;
			 System.err.println(" You Transfered :" +hdfcWithDraw+" amount to number : "+receiveNum);
			 System.out.println(" Amount Present in account after with draw :"+accountBalance);thankYou1();
		 }else
		 {	 System.err.println(" \t\tYou entered amount is greater than Balance. \n\t\t     So transcations not successful . ");
			 System.out.println(" \nDo you want to try transcation again . \n\t Y - To initiate transcation again \t I - Go back to HDFC Account . \t M - Main Page . \n");
			 java.util.Scanner mr=new java.util.Scanner(System.in);
			 char transcation=mr.next().charAt(0); 
			 if(transcation=='Y')
			 {
				 transfer();
			 }else if(transcation=='I')
			 {
				 welcome();
			 }
			 else if(transcation=='M')
			 {
				 FactoryClass fc=new FactoryClass();
			 		fc.choice();
			 }
			 else
			 		{
			 			System.err.println(" \t\t\t\t   Invalid Choice .  ");
			 			System.out.println(" \t\t\t\t  See you next time . ");
			 			System.exit(0);
			 		}
			 
		 }
		
		
	}
	void thankYou1()
	{
		for(int i=1;i<=5;i++)
		{
				System.out.print(" @ ");
		}
			
		System.out.println(" \" Thank You for using HDFC Bank for Google Pay Payment . \" $  $  $  $  $ ");
		System.exit(0);
		
	}
}

class UnionBank extends Google_Pay
{
	double hdfcBalance=20000.0;
	void welcome()
	{
		System.out.println("\t @==@ @=@ @= @     Welcome to Union Bank .     @ =@ @=@ @==@ ");
		System.out.println("\t      =@= =@ =  \"Good People to Bank with\"   = @= =@= ");
		System.out.println(" \t What transcation do you wish to do :\n\t1-Check Balance\n\t2-Do Transcation");
		System.out.println("\tEnter your choice");
		java.util.Scanner mr1=new java.util.Scanner(System.in);
		int userHDFCChoice=mr1.nextInt();
		if(userHDFCChoice==1)
		{
			balance();
		}else if(userHDFCChoice==2)
		{
			transfer();
		}else
		{System.err.println(" \t\t\t\t   Invalid Choice .  \n\t\t\t\t     Try Again . ");
			welcome();
		}
	}
	@Override
	void balance() 
	{
		System.out.println(" Your Present Balance is : "+ hdfcBalance);
		thankYou1();
		
	}

	@Override
	void transfer() 
	{
		System.out.println(" \t\t\t=== = == Enter the money you wish to Transfer . == = ===");
		 java.util.Scanner mr1=new java.util.Scanner(System.in);
		 double hdfcWithDraw=mr1.nextDouble();
		 if(hdfcWithDraw<hdfcBalance)
		 {
			 System.out.println("\nEnter the receiver number ");
			 java.util.Scanner mr3=new java.util.Scanner(System.in);
			 long receiveNum=mr3.nextLong();
			 double accountBalance=hdfcBalance-hdfcWithDraw;
			 System.err.println(" You Transfered :" +hdfcWithDraw+" amount to number : "+receiveNum);
			 System.out.println(" Amount Present in account after with draw :"+accountBalance);thankYou1();
		 }else
		 {	 System.err.println(" \t\tYou entered amount is greater than Balance. \n\t\t     So transcations not successful . ");
			 System.out.println(" \nDo you want to try transcation again . \n\t Y - To initiate transcation again \t I - Go back to Union Bank Account . \t M - Main Page . \n");
			 java.util.Scanner mr=new java.util.Scanner(System.in);
			 String transcation=mr.next(); 
			 if(transcation.equalsIgnoreCase("Y"))
			 {
				 transfer();
			 }else if(transcation.equalsIgnoreCase("I"))
			 {
				 welcome();
			 }
			 else if(transcation.equalsIgnoreCase("M"))
			 {
				 FactoryClass fc=new FactoryClass();
			 		fc.choice();
			 }
			 else
			 		{
			 			System.err.println(" \t\t\t\t   Invalid Choice .  ");
			 			System.out.println(" \t\t\t\t  See you next time . ");
			 			System.exit(0);
			 		}
			 
		 }
		
		
	}
	void thankYou1()
	{
		for(int i=1;i<=5;i++)
		{
				System.out.print(" @ ");
		}
			
		System.out.println(" \" Thank You for using Union Bank for Google Pay Payment . \" $  $  $  $  $ ");
		System.exit(0);
		
	}
}

class Bank_of_Borada extends Google_Pay
{
	double hdfcBalance=20000.0;
	void welcome()
	{
		System.out.println("\t @==@ @=@ @= @     Welcome to Bank of Borada .     @ =@ @=@ @==@ ");
		System.out.println("\t      =@= =@ =   \"India's International Bank\"    = @= =@= ");
		System.out.println(" \t What transcation do you wish to do :\n\t1-Check Balance\n\t2-Do Transcation");
		System.out.println("\tEnter your choice");
		java.util.Scanner mr1=new java.util.Scanner(System.in);
		int userHDFCChoice=mr1.nextInt();
		if(userHDFCChoice==1)
		{
			balance();
		}else if(userHDFCChoice==2)
		{
			transfer();
		}else
		{System.err.println(" \t\t\t\t   Invalid Choice .  \n\t\t\t\t     Try Again . ");
			welcome();
		}
	}
	@Override
	void balance() 
	{
		System.out.println(" Your Present Balance is : "+ hdfcBalance);
		thankYou1();
		
	}

	@Override
	void transfer() 
	{
		System.out.println(" \t\t\t=== = == Enter the money you wish to Transfer . == = ===");
		 java.util.Scanner mr1=new java.util.Scanner(System.in);
		 double hdfcWithDraw=mr1.nextDouble();
		 if(hdfcWithDraw<hdfcBalance)
		 {
			 System.out.println("\nEnter the receiver number ");
			 java.util.Scanner mr3=new java.util.Scanner(System.in);
			 long receiveNum=mr3.nextLong();
			 double accountBalance=hdfcBalance-hdfcWithDraw;
			 System.err.println(" \tYou Transfered :" +hdfcWithDraw+" amount to number : "+receiveNum);
			 System.out.println("   Amount Present in account after with draw :"+accountBalance);thankYou1();
		 }else
		 {	 System.err.println(" \t\tYou entered amount is greater than Balance. \n\t\t     So transcations not successful . ");
			 System.out.println(" \nDo you want to try transcation again . \n\t Y - To initiate transcation again \t I - Go back to Bank of Borada  Account . \t M - Main Page . \n");
			 java.util.Scanner mr=new java.util.Scanner(System.in);
			 char transcation=mr.next().charAt(0); 
			 if(transcation=='Y')
			 {
				 transfer();
			 }else if(transcation=='I')
			 {
				 welcome();
			 }
			 else if(transcation=='M')
			 {
				 FactoryClass fc=new FactoryClass();
			 		fc.choice();
			 }
			 else
			 		{
			 			System.err.println(" \t\t\t\t   Invalid Choice .  ");
			 			System.out.println(" \t\t\t\t  See you next time . ");
			 			System.exit(0);
			 		}
			 
		 }
		
		
	}
	void thankYou1()
	{
		for(int i=1;i<=5;i++)
		{
				System.out.print(" @ ");
		}
			
		System.out.println(" \" Thank You for using Bank of Borada for Google Pay Payment . \" $  $  $  $  $ ");
		System.exit(0);
		
	}
}

class FactoryClass
{
	void choice()
	{ 
		//UserDetails ud=new UserDetails();Number nu=new Number();//nu.userCheck2;
	//ud.userName;
		System.out.println("\t\tIn which branch Bank do you wish to do transcation\n\t\t\t 1 - ICICI\n\t\t\t 2 - SBI\n\t\t\t 3 - HDFC\n\t\t\t 4 - Union Bank\n\t\t\t 5 - Bank of Borada");
		java.util.Scanner mr=new java.util.Scanner(System.in);
		int userChoice=mr.nextInt();
		if(userChoice==1) 
		{
			ICICI i=new ICICI();
			i.welcomeICICI();
		}else if(userChoice==2)
		{
			SBI s=new SBI();
			s.welcomeSBI();
		}else if(userChoice==3)
		{
			HDFC h=new HDFC();
			h.welcome();
		}else if(userChoice==4)
			{
			UnionBank ub=new UnionBank();
			ub.welcome();
			}else if(userChoice==5)
			{
				Bank_of_Borada bb=new Bank_of_Borada();
				bb.welcome();
			}
		else {
			System.err.println(" \t\t\t\t   Invalid Choice .  \n\t\t\t\t     Try Again . ");
		 choice();
		}
	}
}


