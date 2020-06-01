/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

/**
 *
 * @author 136-fkhoubsirat
 */
import java.util.Scanner;

public class bank {

    public static void main(String[] Args) {

        int userAction;
        int userTrans;
        String userContinueResponse;
        Scanner input = new Scanner(System.in);

        System.out.println("please add a client");
        Client one1 = new Client();
        System.out.println("please enter first name");
        String fName = input.next();
        input.nextLine();
        System.out.println("please enter the last name");
        String Lname = input.nextLine();
        System.out.println("please enter the phone num");
        String pNum = input.next();
        input.nextLine();
        System.out.println("please enter the address");
        String addy = input.nextLine();
        System.out.println("please enter the sinNum");
        String sinNum = input.next();

        System.out.println("please enter the email");
        String email = input.next();

        input.nextLine();
        System.out.println("please enter the postal code");
        String pCode = input.nextLine();

        System.out.println("please enter the city");
        String city = input.nextLine();

        one1.addClient(fName, Lname, pNum, addy, sinNum, email, pCode, city);

        System.out.println("now add the account info");

        account one = new account();
        System.out.println("please enter account number");
        int accNum = input.nextInt();
        input.nextLine();
        System.out.println("please enter acc type");
        String accType = input.nextLine();
        System.out.println("please enter acc balance");
        double balance = input.nextDouble();

        one.addAcc(accNum, accType, balance);

        do {
            System.out.println("What would you like to do?");

            System.out.println("1-Show the client info");

            System.out.println("2-Get the account Balance");

            System.out.println("3-Do a Transaction");

            userAction = input.nextInt();

            if (userAction == 1) {

                System.out.println(one1.showClientInfo());
            } else if (userAction == 2) {

                System.out.println(one.getBalance());

            } else if (userAction == 3) {

                System.out.println("What transaction would you like to do: ");

                System.out.println("1-Deposit\n2-Withdraw\n3-Transfer");

                userTrans = input.nextInt();

                switch (userTrans) {

                    case 1:
                        System.out.println("How much would you like to deposit?");
                        double userDeposit = input.nextDouble();
                        System.out.println("Done!");
                        one.deposit(userDeposit);
                        break;
                    case 2:
                        System.out.println("How much would you like to Withdraw?");
                        double userWithdraw = input.nextDouble();
                        one.withdraw(userWithdraw);
                        System.out.println("Done!");
                        break;
                    case 3:
                        System.out.println("How much would you like to Transfer?");
                        double userTransfer = input.nextDouble();
                        one.transfer(userTransfer);
                        System.out.println("Done!");
                        break;

                }

                System.out.println("Would you like to see your balance?");
                String userBalanceResponse = input.next();
                if (userBalanceResponse.equalsIgnoreCase("yes")) {

                    System.out.println(one.getBalance());
                }

            } else {

                System.out.println("Invalid Entry");
            }

            System.out.println("Would you like to continue?");
            userContinueResponse = input.next();

        } while (userContinueResponse.equalsIgnoreCase("yes"));

    }
}
