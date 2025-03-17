package com.braindata.bankmanagement.client;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rbi bank = new Sbi();
        int choice;
        
        do {
            System.out.println("\nWelcome to SBI Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
            
            case 1:
                bank.createAccount();
                break;
            case 2:
                bank.displayAllDetails();
                break;
            case 3:
                bank.depositeMoney();
                break;
            case 4:
                bank.withdrawal();
                break;
            case 5:
                bank.balanceCheck();
                break;
            case 6:
                System.out.println("Exiting system...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 6);
        
}
	
}
