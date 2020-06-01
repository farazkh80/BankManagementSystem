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
public class account {

    private static int accountNum;
    private static String type;
    private static double balance;

    public void addAcc(int accNum, String accType, double accBalance) {
        accountNum = accNum;
        type = accType;
        balance = accBalance;

    }

    public double deposit(double deposit) {

        balance = balance + deposit;
        return balance;
    }

    public double withdraw(double withDraw) {

        balance = balance - withDraw;
        return balance;
    }

    public double transfer(double transfer) {

        balance = balance - transfer;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void cancel() {
        accountNum = -1;
        type = "";
        balance = -1;

    }

}
