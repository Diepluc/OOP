public class CheckingAccount extends Account {
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * cus.
     */
    @Override
    public void withdraw(double withdraw) {
        try {
            doWithdrawing(withdraw);
            Transaction trans = new Transaction(2, withdraw,
                    balance + withdraw, balance);
            transactionList.add(trans);
        } catch (InsufficientFundsException e) {
            e.getMessage();
        }

    }

    /**
     * cus.
     */
    @Override
    public void deposit(double deposit) {
        try {
            doDepositing(deposit);
            Transaction trans = new Transaction(1,
                    deposit, balance - deposit, balance);
            transactionList.add(trans);
        } catch (InvalidFundingAmountException e) {
            e.getMessage();
        }

    }
}
