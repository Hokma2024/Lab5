class SavingsAccount extends Account
{
    private static final double INTEREST_RATE = 0.03; // 3% годовых

    public SavingsAccount(String accountHolder, double balance)
    {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest()
    {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Проценты по сберегательному счету добавлены: " + interest);
    }
}