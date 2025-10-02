import java.util.*;
public class JavaProject1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        System.out.println("ENTER THE BALANCE AMOUNT : ");
        double balance = in.nextDouble();

        boolean isRunning = true;

        // DISPLAYING STUFFS
        while (isRunning) {
            System.out.println("***************************");
            System.out.println("      BANKING PROGRAM      ");
            System.out.println("***************************");
            System.out.println("1 . CHECK BALANCE     : ");
            System.out.println("2 . CASH DEPOSIT      : ");
            System.out.println("3 . CASH WITHDRAWL    : ");
            System.out.println("4 .****EXIT PROCESS****");

            // USER NEEDS TO SELECT CHOICE OF PROCESS
            System.out.print("ENTER THE CHOICE OF PROCESS TO BE PROCESSED (1 - 4 ) : ");
            choice = in.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += cashDeposit();
                case 3 -> balance -= cashWithdrawl(balance);
                case 4 -> result(isRunning);
                default -> System.out.println("***INVALID CHOICE***");
            }
        }
    }
    // FUNCTION FOR DISPLAYING BALANCE
    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("\t$%.2f\n", balance);
        System.out.println("***************");
    }
    // FUNCTION FOR CASH DEPOSIT
    static double cashDeposit() {
        System.out.println("ENTER THE AMOUNT TO BE DEPOSITED : ");
        double deposit = in.nextDouble();
        if (deposit == 100 || deposit == 500) {
            System.out.println("***************");
            System.out.println("ENTER THE AMOUNT TO BE DEPOSITED : " + deposit);
            System.out.println("***************");
            System.out.println("ENTER THE NUMBER OF NOTES TO BE DEPOSITED : ");
            int NoOfNotes = in.nextInt();
            double totalAmount = deposit * NoOfNotes;

            boolean isAmtInserted = false;
            if (deposit < 0) {
                System.out.println("AMOUNT CAN'T BE NEGATIVE");
                return 0;
            }
            else {
                System.out.println("ENTER ANY ONE OF THE OPTIONS BELOW (1 - 3) ");
                int option = in.nextInt();
                switch (option) {
                    case 1 -> {
                        isAmtInserted = true;
                        System.out.println("AMOUNT IS INSERTED ");
                    }
                    case 2 -> {
                        isAmtInserted = false;
                        System.out.println("AMOUNT IS NOT INSERTED ");
                    }
                    default -> System.out.println("CHOOSE ANY ONE OPTION");
                }
                if (isAmtInserted) {
                    System.out.println("WAIT FOR A WHILE TILL THE PROCESS GETS COMPLETED...");
                    // 🔹 Add 4 seconds delay
                    try {
                        Thread.sleep(4000);  // 4000ms = 4 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("INSERTED AMOUNT IS DEPOSITED!!");
                }
                else {
                    System.out.println("INSERT THE AMOUNT!");
                }
            }
            return totalAmount;
        }
        else {
            System.out.println("ONLY 100 & 500 NOTES CAN BE DEPOSITED");
            return 0;
        }
    }
    // FUNCTION FOR CASH WITHDRAWL
    static double cashWithdrawl(double balance){
        System.out.println("ENTER THE AMOUNT TO BE WITHDRAWN : ");
        double AmtWithdrawl = in.nextDouble();
        System.out.println("****************************************");
        System.out.println("ENTER THE AMOUNT TO BE WITHDRAWNED " + AmtWithdrawl);
        System.out.println("****************************************");
        if(AmtWithdrawl > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(AmtWithdrawl < 0) {
            System.out.println("AMOUNT CAN'T BE NEGATIVE ");
            return 0;
        }
        else{
            double Remainingmoney = balance - AmtWithdrawl;
            if(Remainingmoney >= 100) {
                System.out.println("****************************************");
                System.out.println("AMOUNT WITHDRAWN IS : " + AmtWithdrawl);
                System.out.println("AMOUNT REMAINING : " + Remainingmoney);
                System.out.println("****************************************");
            }
            else {
                System.out.println("****************************************");
                System.out.println("AMOUNT SHOULD BE GREATER THAN OR EQUAL TO 100");
                System.out.println("****************************************");
            }
            return AmtWithdrawl;
        }
    }
    // FUNCTION FOR ENDING PURPOSES
    static void result(boolean isRunning){
        isRunning = false;
        System.out.println("THANK YOU HAVE A NICE DAY!...");
    }
}
