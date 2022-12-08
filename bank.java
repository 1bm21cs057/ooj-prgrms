import java.util.Scanner;
import java.lang.*;
class Account
{
	String name,type;
	int accno;
	double balance;
	void setD()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter customer name: ");
		name=s.next();
		System.out.print("Enter type of account: ");
		type=s.next();
		System.out.print("Enter account number: ");
		accno=s.nextInt();
		System.out.print("Enter bank balance: ");
		balance=s.nextDouble();
	}
	void display()
	{
		System.out.println("Customer name is: "+name);
		System.out.println("Customer account type is: "+type);
		System.out.println("Customer account number is: "+accno);
		System.out.println("Current balance is: "+balance);
	}
	void deposit()
	{
		System.out.print("Enter the amount to be deposited: ");
		Scanner s=new Scanner(System.in);
		double amt=s.nextDouble();
		balance+=amt;
	}	
}
class Sav_acc extends Account
{
	double interest;
	void compInt()
	{
		int time_in_yrs;
		float intr_rate_inPerc;
		int n; Scanner s=new Scanner(System.in);
		System.out.println("Enter time in yrs: "); time_in_yrs=s.nextInt();
		System.out.println("Enter rate of interest: "); intr_rate_inPerc=s.nextFloat();
		System.out.println("Enter the number of times interest is compounded per year: "); n=s.nextInt();
		interest=balance*(Math.pow((1+intr_rate_inPerc/n),(n*time_in_yrs)));
		balance+=interest;
	}
	void withdraw()
	{
		System.out.println("Enter the amount to be withdrawn: "); Scanner s=new Scanner(System.in);
		double amt=s.nextDouble();
		if(balance>amt)
		{balance-=amt;}
		else
		{System.out.println("Amount to be withdrawn greater than balance!!!");}
	}

}
class Cur_acc extends Account
{
	void min_balance()
	{
		if(balance<1000) 
		{
			System.out.println("Rupees 100 penalty imposed"); 
			balance=balance-100;
		}
		else{System.out.println("No penalty imposed");}
	}
	void withdraw()
	{
		System.out.println("Enter the amount to be withdrawn: "); Scanner s=new Scanner(System.in);
		double amt=s.nextDouble();
		if(balance>amt)
		{balance-=amt;}
		else
		{System.out.println("Amount to be withdrawn greater than balance!!!");}
	}
}
class Bank
{
	public static void main(String ss[])
	{
		Scanner s=new Scanner(System.in);
		String op1,op2;
		Sav_acc s1=new Sav_acc();
		Cur_acc c1=new Cur_acc();
		while(true)
		{
		System.out.print("Enter the choice: \n1a.Set the values for savings acc\n1b. display\n1c. deposit\n1d. Interest\n1e. Withdraw\n1f. exit\n");
		op1=s.next();
		switch(op1)
		{
			case "1a":s1.setD();
				  break;
			case "1b":s1.display();
				  break;
			case "1c":s1.deposit();
				  break;
			case "1d":s1.compInt();
				  break;
			case "1e":s1.withdraw();
				  break;
			case "1f":System.exit(0);
		}
		
		
		
		System.out.print("Enter the choice: \n2a.Set the values for current account\n2b. display\n2c. deposit\n2d. minBalance\n2e. Withdraw\n2f. exit\n");
		op2=s.next();
		switch(op2)
		{
			case "2a":c1.setD();
				  break;
			case "2b":c1.display();
				  break;
			case "2c":c1.deposit();
				  break;
			case "2d":c1.min_balance();
				  break;
			case "2e":c1.withdraw();
				  break;
			case "2f":System.exit(0);
		}
		}
	}
}
