package com.company;

public class BankAccount {
    private double amount;

    public  double getAmount(){
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
        System.out.println("Остаток на карте " + amount);

    }

    public void withDraw(int sum) throws LimitException {
        if (amount<sum){
            throw new LimitException("На вашем счете недостаточно средств", amount);
        }
        else {
            amount -= sum;
            System.out.println("на вашем счете " + amount);
        }


    }

}
