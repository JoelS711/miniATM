package miniATM;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		String name = "Joel S";
		String accountType = "Ahorros";
		double balance = 30000.00;
		int option = 0;

		System.out.println("*************************");
		System.out.println("\nName: " + name);
		System.out.println("Account Type: " + accountType);
		System.out.println("Available Balance: " +balance+ "$");
		System.out.println("\n*************************");

		String menu = """
				*** Choose the option ***
				1. Check balance
				2. Withdraw money
				3. Deposit money
				9. Exit
				\n""";
		Scanner keyboard = new Scanner(System.in);
		while (option != 9) {
			System.out.println(menu);
			option = keyboard.nextInt();

			switch (option) {
			case 1:
				System.out.println("Available balance: " + balance + "$");
				break;
			case 2:
				System.out.println("What is the value you want to withdraw?");
				double valueToWithdraw = keyboard.nextDouble();
				if (balance < valueToWithdraw) {
					System.out.println("insufficient funds");
				} else {
					balance = balance - valueToWithdraw;
					System.out.println("Updated balance: " + balance + "$");
				}
				break;
			case 3:
				System.out.println("What is the value you want to deposit?");
				double valueToDeposit = keyboard.nextDouble();
				balance += valueToDeposit;
				System.out.println("Updated balance: " + balance + "$");
				break;
			case 9:
				System.out.println("Thanks for using our services");
				break;
			default:
				System.out.println("Not valid option");
				break;

			}
		}
	}
}
