//Assignment 4 Exerciese1 part2 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
public class SpecialSavings extends SavingsAccount {

    public SpecialSavings(double initialBalance) {
        super(initialBalance);
    }

    public void calculateMonthlyInterest() {
        double effectiveRate = annualInterestRate;
        if (getSavingsBalance() > 10000.0) {
            effectiveRate = 0.10;
        }
        double monthlyInterest = getSavingsBalance() * effectiveRate / 12;
        setSavingsBalance(getSavingsBalance() + monthlyInterest);
    }

    // Deposit money into the account.
    public void deposit(double amount) {
            setSavingsBalance(getSavingsBalance() + amount);
    }

    // Withdraw money from the account.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getSavingsBalance()) {
            setSavingsBalance(getSavingsBalance() - amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
