import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account() {

    }

    /**
     * cus.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * cus.
     */
    public void doWithdrawing(double withdraw)
            throws InsufficientFundsException {
        String str = String.format("%.2f", withdraw);
        if (withdraw < 0 || withdraw > balance) {
            throw new InsufficientFundsException(withdraw);
        }
        balance -= withdraw;
    }

    /**
     * cus.
     */
    public void doDepositing(double deposit)
            throws InvalidFundingAmountException {
        String str = String.format("%.2f", deposit);
        if (deposit < 0) {
            throw new InvalidFundingAmountException(deposit);
        }
        balance += deposit;
    }

    public abstract void withdraw(double withdraw);

    public abstract void deposit(double deposit);

    /**
     * cus.
     */
    public String getTransactionHistory() {
        String his = "Lịch sử giao dịch của tài khoản "
                + accountNumber + ":\n";
        for (int i = 0; i < transactionList.size() - 1; i++) {
            his += transactionList.get(i).getTransactionSummary() + "\n";
        }
        int len = transactionList.size() - 1;
        his += transactionList.get(len).getTransactionSummary();
        return his;
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * cus.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            return ((Account) obj).getAccountNumber() == getAccountNumber();
        }
        return false;
    }
}
