//Assignment 4 Exerciese1 part1 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
public class SavingsAccountDriver {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00); //create two savings accounts with initial balances.

        SavingsAccount.modifyInterestRate(0.04);//annual interest rate to 4%.
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest(); //calculate monthly interest.

        System.out.println("Month interest rate: 4%:");
        System.out.printf("Saver1 balance: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2 balance: $%.2f%n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);//annual interest rate to 5%.

        //calculate and update monthly interest again.
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Next month interest rate: 5%");
        System.out.printf("Saver1 balance: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2 balance: $%.2f%n", saver2.getSavingsBalance());
    }
}
