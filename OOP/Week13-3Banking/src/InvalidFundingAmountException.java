public class InvalidFundingAmountException extends BankException {
    /**
     * khoi tao.
     */
    public InvalidFundingAmountException(double amount) {
        String str = String.format("%.2f", amount);
        System.out.println("Số tiền không hợp lệ: $" + str);
    }
}
