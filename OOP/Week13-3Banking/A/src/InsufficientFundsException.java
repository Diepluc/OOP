public class InsufficientFundsException extends BankException {

    /**
     * khoi tao.
     */
    public InsufficientFundsException(double amount) {
        String str = String.format("%.2f", amount);
        if (amount < 0) {
            System.out.println("Số tiền không hợp lệ: $" + str);
        } else {
            System.out.println("Số dư tài khoản không đủ $"
                    + str + " để thực hiện giao dịch");
        }
        if (amount > 1000) {
            System.out.println("Số tiền không hợp lệ: $" + str);
        }
    }
}
