package projectATM;

import java.util.Scanner;

public class ProgramATM {

	public static void main(String[] args) {
		int balance = 100000, withdraw,deposit;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Automated Teller machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choode 4 for EXIT");
			System.out.println("Choose the operation you want to perform: ");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter money to be withdraw: ");
				withdraw = sc.nextInt();
				if(balance >= withdraw)
				{
					balance = balance - withdraw;
					System.out.println("please collect your money");
				}
				else
				{
					System.out.println("Insufficient Balance");
					
				}
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Enter money to be deposited:");
				deposit = sc.nextInt();
				
				balance = balance + deposit;
				System.out.println("your money has been sucessfully depsited");
				System.out.println("");
				break;
				
			case 3:
				System.out.println("Blance :  " +balance);
				System.out.println("");
				break;
				
			case 4:
				System.exit(0);
			
			}
		}
		

	}

}
