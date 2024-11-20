abstract class Account
{
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder()
    {
        return accountHolder;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance=balance + amount;
        }
        else
        {
            System.out.println("Сумма для депозита должна быть положительной.");
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance=balance - amount;
        }
        else
        {
            System.out.println("Недостаточно средств или неверная сумма.");
        }
    }

    protected void setBalance(double balance)
    {
        this.balance = balance;
    }

    // Абстрактный метод для расчёта процентов
    public abstract void calculateInterest();

    public void displayAccountInfo()
    {
        System.out.println("Владелец: " + accountHolder);
        System.out.println("Баланс: " + balance);
    }

}
interface Loanable
{
    void applyForLoan(double amount);
}