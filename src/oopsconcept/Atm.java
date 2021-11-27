package oopsconcept;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int balance= 50000, Withdraw, Deposit ;
        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println("Automated teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you want to perform from the above: ");
            int choice= s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter money to be Withdraw: ");
                    Withdraw = s.nextInt();
                    if (balance >= Withdraw) {
                        balance = balance - Withdraw;
                        System.out.println("Please collect your money");

                    } else {
                        System.out.println("Insufficient Balance");

                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be Deposited: ");
                    Deposit = s.nextInt();
                    balance = balance + Deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);

                }


            }


        }



    }






