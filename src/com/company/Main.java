package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount peter = new BankAccount();
        peter.deposit(20000);
        while (true) {

            try {
                peter.withDraw(6000);
            } catch (LimitException e) {
                e.printStackTrace();
                try {
                    peter.withDraw((int) peter.getAmount());
                    break;
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
            }

        }


    }
}
