/*import java.util.Scanner;
class atmmachine{
    private BankAccount account;
    public atmmachine(BankAccount account) {
        this.account = account;
    }
    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Welcome to ATM machine");
            System.out.println("ATM MENU");
            System.out.println("1->Deposit");
            System.out.println("2->Withdraw");
            System.out.println("Check Balance");
            System.out.println("Exit");
            System.out.println("Enter Your Choice");
            choice=scanner.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter The Amount You Want To Deposit->");
                    double depositamt=scanner.nextDouble();
                    account.deposit(depositamt);
                    break;
                case 2:
                    System.out.println("Enter The Amount You Want To Withdraw->");
                    double withdrawamt=scanner.nextDouble();
                    account.withdraw(withdrawamt);
                    break;
                case 3:
                    account.checkbalance();
                    break;
                case 4:
                    System.out.println("Thank You For Using The ATM Machine.Have A Nice Day:)");
                    break;
                default:
                System.out.println("Invalid Choice.Please Try Again.");
            }
            while(choice!=4){
                scanner.close();
            }
        
    
class BankAccount{
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Deposit Sucessfully.Your Current Balance Is "+balance);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<balance){
            balance=balance-amount;
        }
        else{
            System.out.println("Invalid Withdraw Amount.Insufficient balance.");
        }
    }

    public void checkbalance(){
        System.out.println("Your Current Balance Is-> "+balance);
    }
}
public class Main{
    public static void main(Strings[]agrs){
        BankAccount account=new BankAccount(1000.0);
        atmmachine atm=new atmmachine(account);
        atm.Menu();
    }
}*/

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful. Your Current Balance Is " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful. Your Current Balance Is " + balance);
        } else {
            System.out.println("Invalid Withdrawal Amount. Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Your Current Balance Is -> " + balance);
    }
}

class ATMmachine {
    private BankAccount account;

    public ATMmachine(BankAccount account) {
        this.account = account;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to ATM machine");
            System.out.println("ATM MENU");
            System.out.println("1 -> Deposit");
            System.out.println("2 -> Withdraw");
            System.out.println("3 -> Check Balance");
            System.out.println("4 -> Exit");
            System.out.println("Enter Your Choice:");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter The Amount You Want To Deposit:");
                    double depositAmt = scanner.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case 2:
                    System.out.println("Enter The Amount You Want To Withdraw:");
                    double withdrawAmt = scanner.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You For Using The ATM Machine. Have A Nice Day :)");
                    break;
                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        ATMmachine atm = new ATMmachine(account);
        atm.menu();
    }
}
