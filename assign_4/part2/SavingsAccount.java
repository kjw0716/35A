//Assignment 4 Exerciese1 part2 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
public class SavingsAccount {
    private double savingsBalance;
    protected static double annualInterestRate;

    public SavingsAccount(double initialBalance) {
        this.savingsBalance = initialBalance;
    }

    //Calculates the monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += monthlyInterest;
    }

    //set the annual interest rate to a new vaule.
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    //getter for the savingsBalance.
    protected double getSavingsBalance() {
        return savingsBalance;
    }

    //setter for the savingsBalance.
    protected void setSavingsBalance(double newBalance) {
        this.savingsBalance = newBalance;
    }
}
