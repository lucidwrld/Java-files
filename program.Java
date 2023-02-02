package value;
import java.lang.*;
//Program to accept users name and welcome your customer;
import java.util.Scanner;

public class game {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        // ATM Options
	        System.out.println("Welcome to RoyBank\n\n1. Deposit\n2. Withdrawal\n3. Check Balance\n");
	        int c;
	        do {
	            System.out.print("Choose an Option: ");
	            c = in.nextInt(); // must be between 1 & 3
	        } while (c > 3 || c < 1);
	        ATM(c, 100000F, ""); // first call
	    }

	    public static void ATM(int choice, float balance, String YN) {
	        Scanner in = new Scanner(System.in); // for method scope inputs
	        String yn;
	        // if "N" was the last choice, end the Program
	        if (YN.equalsIgnoreCase("N")) {
	            System.out.println("\nThank you for Banking with us !");
	            System.exit(0);
	        }
	        int c = 0, withdraw, deposit;
	        // to handle the first call from outside the method ie the non-Zero choice
	        if (choice == 0) {
	            System.out.println("1. Deposit\n2. Withdrawal\n3. Check your account Balance");
	            do {
	                System.out.print("next choice: ");
	                c = in.nextInt(); // must be between 1 & 3
	            } while (c > 3 || c < 1);
	        } else {
	            c = choice; // if "choice" had a value, use it
	        }
	        // switch for handling the options
	        switch (c) {
	            case 1 -> {
	                System.out.print("Deposit: $");
	                deposit = in.nextInt();
	                System.out.println("continue (Y/N): ");
	                yn = in.next();
	                ATM(0, balance + Math.abs(deposit), yn);
	            }
	            // using the absolute value to prevent adding a negative deposit value (withdrawal)
	            case 2 -> {
	                do {
	                    System.out.printf("(New Balance: Balance is %.2f) Withdraw: $", balance);
	                    withdraw = in.nextInt(); // must not be greater than the current balance
	                } while (withdraw > balance);
	                System.out.println("continue (Y/N): ");
	                yn = in.next();
	                ATM(0, balance - Math.abs(withdraw), yn);
	            }
	            // using the absolute value to prevent withdrawing a negative withdrawal (deposit)
	            case 3 -> {
	                System.out.printf("- Your Balance is $%.2f\n", balance);
	                System.out.println("continue (Y/N): ");
	                yn = in.next();
	                ATM(0, balance, yn);
	            }
	        }
	    
	    }
}
