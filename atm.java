package atm.java;
import java.util.Scanner;
public class atm 
{

	public static void main(String[] args)
	{
		int balance=1000000;
		int withdraw,deposit;
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("  welcome to xxx Bank ");
			System.out.println("**************************");
			System.out.println("  choose 1: Withdraw");
			System.out.println("  choose 2: Deposit");
			System.out.println("  choose 3: Check Balance");
			System.out.println("  choose 4: Exit");
			System.out.println("Choose the operation you want to perform");
			
			int choice =sc.nextInt();
			switch(choice)
			{
			 case 1:
				 System.out.println("Enter Amount to withdraw");
				 withdraw = sc.nextInt();
				 
				 if(balance >= withdraw)
				 {
					 balance = balance-withdraw;
					 System.out.println("please collect your money");
				 }
				 else
				 {
					 System.out.println("Insufficient balance in your account");
				 }
				 System.out.println("");
				 break;
				 
			 case 2:
				 System.out.println("Enter amount to be deposit:");
				 
				 deposit = sc.nextInt();
				 balance = balance+deposit;
				 System.out.println("Your money is deposited");
				 System.out.println("Your balance is updted ");
				 System.out.println("");
				 
				 break;
			 case 3:
				 System.out.println("avaliable Balance is: "+ balance);
				 System.out.println("");
				 break;
			 case 4:
			 {
				 System.exit(0);
			 }	 
			}
		}
	}

}
