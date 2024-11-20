class CreditAccount extends Account implements Loanable
{
    private static final double INTEREST_RATE = 0.05; // 5% годовых на задолженность
    private double debt = 0; // Задолженность

    public CreditAccount(String accountHolder, double balance)
    {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest()
    {
        if (debt > 0)
        {
            double interest = debt * INTEREST_RATE;
            debt=debt + interest;
            System.out.println("Проценты по кредиту начислены: " + interest);
        }
    }

    @Override
    public void applyForLoan(double amount)
    {
        if (amount > 0)
        {
            debt=debt + amount;
            System.out.println("Кредит в размере " + amount + " добавлен. Текущая задолженность: " + debt);
            setBalance(getBalance() + amount);
        }
        else
        {
            System.out.println("Сумма кредита должна быть положительной.");
        }
    }

    @Override
    public void displayAccountInfo()
    {
        System.out.println("Владелец: " + getAccountHolder());
        System.out.println("Баланс: " + getBalance());
        System.out.println("Кредитная задолженность: " + debt);
    }
}