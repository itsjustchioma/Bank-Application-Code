import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class BankMethods {
    private static Scanner scanner = new Scanner(System.in);
    private int accNo;
    private String accType;
    private String name;
    private int balance;
    ArrayList <Object> arraylist = new ArrayList<>();

    // CONSTRUCTOR
//    public BankMethods()
//
//    }

    // METHOD: FOR INITIALIZATION
    public void numberOne(){
        System.out.println("How many customers do you want to input? ");

        // FOR INPUT-MISMATCH ERROR
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            int array[] = new int[input];

            // PUTTING VALUES IN THE ARRAY; LOOPING THROUGH THE ARRAY AND FILLING IT
            // MAKING AN ARRAYLIST THAT WILL STORE THE VALUES
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter account number (3-digit number) : ");
                accNo = scanner.nextInt();
                arraylist.add(accNo);
                System.out.println("Enter account type (Savings, current or fixed) : ");
                accType = scanner.next();
                arraylist.add(accType);
                System.out.println("Enter name: ");
                name = scanner.next();
                arraylist.add(name);
                System.out.println("Enter balance: ");
                balance = scanner.nextInt();
                arraylist.add(balance);
            }
            // FOR LOOP TO DISPLAY USER INPUT
            for (int i=0; i< arraylist.size(); i++){
                System.out.println(arraylist.get(i));
            }

            //    CALLING THE DISPLAY OPTION METHOD
            meth();

        }
        else {
            System.out.println("Input Mismatch");
//        numberOne();
        }
    }

    // METHOD: BANKING APPLICATION SYSTEM
    public void meth(){
        System.out.println("***** BANKING APPLICATION SYSTEM *****");
        System.out.println("1. Display all account details. ");
        System.out.println("2. Search by account number.");
        System.out.println("3. Deposit the amount. ");
        System.out.println("4. Withdraw the amount");
        System.out.println("5. Exit.");
        System.out.println("Enter your choice. ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayDetails();
                break;
            case 2:
                searchByAcct();
                break;
            case 3:
                depositAmount();
                break;
            case 4:
                withdrawAmount();
                break;
            case 5:
                exit();
                break;
            default:
                System.out.println("Select a valid option. ");
        }
    }

    // 1. DISPLAY DETAILS
    public void displayDetails(){
        System.out.println("*** User details ***");
        for (int i=0; i< arraylist.size(); i++){
            System.out.println(arraylist.get(i));
        }

        meth();
    }

    // 2. SEARCH BY ACCOUNT
    public void searchByAcct(){
        System.out.println("Enter the account number you want to search: ");
        int search = scanner.nextInt();
        if (accNo == search){
            System.out.println("Account found");

        }
        else{
            System.out.println("No match found.");
        }
        meth();
    }

    // 3. DEPOSIT
    public void depositAmount(){
        System.out.println("Enter the account number of the account you'd like to deposit in:");
        int accDep = scanner.nextInt();
        // FIX PROBLEM HERE ************************************************************************************
        if (accNo == accDep){
        // LOOPING THROUGH EACH USER
        for (int i =0; i< arraylist.size();i++){
            // IF ACC-NO == POSITION 1 BASICALLY
        if (accDep== arraylist.indexOf(0)){
            System.out.println("Enter the amount you'd like to deposit");
            int deposit = scanner.nextInt();
            int newAmt = deposit + balance;
            arraylist.set(3, newAmt);
            System.out.println("The new account balance is: N"+arraylist.get(3));
            meth();
        }
        }}}

    // 4. WITHDRAW
    public void withdrawAmount(){
        System.out.println("Withdraw Amount");
        meth();
    }

    // 5. EXIT
    public void exit(){
        System.out.println("You have exited the application.");
    }
}
