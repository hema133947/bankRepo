package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

import java.util.Scanner;

public class Sbi implements Rbi {
	    private Account account = new Account();
	    private Scanner scanner = new Scanner(System.in);

	    @Override
	    public void createAccount() {
	        System.out.println("Enter Account Number: ");
	        account.setAccNo(scanner.nextInt());
	        scanner.nextLine(); // consume the remaining newline character
	        System.out.println("Enter Name: ");
	        account.setName(scanner.nextLine());
	        System.out.println("Enter Mobile Number: ");
	        account.setMobNo(scanner.nextLine());
	        System.out.println("Enter Aadhar Number: ");
	        account.setAdharNo(scanner.nextLine());
	        System.out.println("Enter Gender: ");
	        account.setGender(scanner.nextLine());
	        System.out.println("Enter Age: ");
	        account.setAge(scanner.nextInt());
	        System.out.println("Enter Initial Balance: ");
	        account.setBalance(scanner.nextDouble());

	        System.out.println("Account created successfully!");
	    }

	    @Override
	    public void displayAllDetails() {
	        System.out.println("Account Details:");
	        System.out.println("Account Number: " + account.getAccNo());
	        System.out.println("Name: " + account.getName());
	        System.out.println("Mobile No: " + account.getMobNo());
	        System.out.println("Aadhar No: " + account.getAdharNo());
	        System.out.println("Gender: " + account.getGender());
	        System.out.println("Age: " + account.getAge());
	        System.out.println("Balance: " + account.getBalance());
	    }

	    @Override
	    public void depositeMoney() {
	        System.out.println("Enter amount to deposit: ");
	        double amount = scanner.nextDouble();
	        account.setBalance(account.getBalance() + amount);
	        System.out.println("Deposited " + amount + " successfully. Current balance: " + account.getBalance());
	    }

	    @Override
	    public void withdrawal() {
	        System.out.println("Enter amount to withdraw: ");
	        double amount = scanner.nextDouble();
	        if (amount <= account.getBalance()) {
	            account.setBalance(account.getBalance() - amount);
	            System.out.println("Withdrawn " + amount + " successfully. Current balance: " + account.getBalance());
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	    }

	    @Override
	    public void balanceCheck() {
	        System.out.println("Your current balance is: " + account.getBalance());
	    }
	}


