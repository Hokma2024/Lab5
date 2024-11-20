class CheckingAccount extends Account implements Loanable
{
    private static final double INTEREST_RATE = 0.01; // 1% годовых

    public CheckingAccount(String accountHolder, double balance)
    {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest()
    {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Проценты по текущему счету добавлены: " + interest);
    }
    @Override
    public void applyForLoan(double amount)
    {
        System.out.println("Заявка на кредит для текущего счета на сумму " + amount + " принята. Решение будет принято в ближайшее время.");
    }
}