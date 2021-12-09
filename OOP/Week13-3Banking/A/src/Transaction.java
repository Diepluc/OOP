public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * cus.
     */
    public Transaction(int type, double amount,
                       double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * cus.
     */
    private String getTransactionTypeString(int type) {
        if (type == TYPE_DEPOSIT_CHECKING) {
            return "Nạp tiền vãng lai";
        }
        if (type == TYPE_WITHDRAW_CHECKING) {
            return "Rút tiền vãng lai";
        }
        if (type == TYPE_DEPOSIT_SAVINGS) {
            return "Nạp tiền tiết kiệm";
        }
        if (type == TYPE_WITHDRAW_SAVINGS) {
            return "Rút tiền tiết kiệm";
        }
        return "";
    }

    /**
     * cus.
     */
    public String getTransactionSummary() {
        String summary = "- Kiểu giao dịch: ";
        summary += getTransactionTypeString(type)
                + ". Số dư ban đầu: $"
                + String.format("%.2f", initialBalance)
                + ". Số tiền: $"
                + String.format("%.2f", amount)
                + ". Số dư cuối: $"
                + String.format("%.2f", finalBalance) + ".";
        return summary;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(double finalBalance) {
        this.finalBalance = finalBalance;
    }
}
