import java.util.Scanner;
public class ATMachine{
private double balance;
public ATMachine(double initialBalance){
    balance = initialBalance;
}

public void deposit_amount(double amount){
    balance += amount;
    System.out.println("Deposit Successful. \n New Balance : " + balance);
}

public void withdraw_amount(double amount){
    if(amount <= balance){
        balance -= amount;
        System.out.println("Withdrawal successful. \n New balance : "+ balance);
    }else{
        System.out.println("Insufficient balance. \n Current Balance : " + balance);
    }
}

public void checkAvailableBalance(){
    System.out.print("Current balance : " + balance);
}
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.print("Enter initial balance: ");
double initialBalance = sc.nextDouble();
ATMachine atm = new ATMachine(initialBalance);
while(true){
    System.out.println("\nATM Menu:");
    System.out.println("1. Deposite");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("4. Exit");
    System.out.println("Enter your choice: ");
    int choice = sc.nextInt();
    switch (choice){
        case 1:
        System.out.println("Enter deposit amount");
        double depositAmount= sc.nextDouble();
        atm.deposit_amount(depositAmount);
        break;
        case 2:
        System.out.println("Enter withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        atm.withdraw_amount(withdrawalAmount);
        break;
        case 3: 
        atm.checkAvailableBalance();
        break;
        case 4:
        System.out.println("Thank you for using the ATM.");
        System.exit(0);
        default :
        System.out.println("Invalid choice. \n Please try again");
        break;
    }
}
}}