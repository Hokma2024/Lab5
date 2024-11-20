public class Main
{
    public static void main(String[] args)
    {
        Account checking = new CheckingAccount("Иван Анигеторян", 1000);
        Account savings = new SavingsAccount("Дабут Садаранов", 2000);
        Account credit = new CreditAccount("Ахмет Петров", -500);


        checking.displayAccountInfo();
        checking.calculateInterest();
        checking.displayAccountInfo();

        savings.displayAccountInfo();
        savings.calculateInterest();
        savings.displayAccountInfo();

        credit.displayAccountInfo();
        credit.calculateInterest();
        credit.displayAccountInfo();


        Loanable loanableChecking = (Loanable) checking;
        loanableChecking.applyForLoan(5000);

        Loanable loanableCredit = (Loanable) credit;
        loanableCredit.applyForLoan(2000);
        credit.displayAccountInfo();
    }
}