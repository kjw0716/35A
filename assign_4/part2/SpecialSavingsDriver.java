//Assignment 4 Exerciese1 part2 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
public class SpecialSavingsDriver {
    public static void main(String[] args) {
        //Create two saver with balances 2000 and 3000.
        SpecialSavings saver1 = new SpecialSavings(2000.00);
        SpecialSavings saver2 = new SpecialSavings(3000.00);

        SavingsAccount.modifyInterestRate(0.04);     //Set interest rate: 4%

        saver1.deposit(9000.00); //saver1 deposits 9000
        saver2.deposit(1000.00); //saaver2 deposits 1000

        saver1.withdraw(500.00); //saver1 withdraw $10500.00
        saver2.withdraw(100.00); //saver2 withdraw $900.00

        System.out.printf("Saver1 balance before interest: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2 balance before interest: $%.2f%n", saver2.getSavingsBalance());

        // Calculate monthly interest.
        saver1.calculateMonthlyInterest(); // Will use 10% 
        saver2.calculateMonthlyInterest(); // Will use 4% 

        System.out.println("After monthly interest:");
        System.out.printf("Saver1 balance: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2 balance: $%.2f%n", saver2.getSavingsBalance());
    }
}
/*
Saver1 balance before interest: $10500.00
Saver2 balance before interest: $3900.00
After monthly interest calculation:
Saver1 balance: $10587.50
Saver2 balance: $3913.00
 */
