public class BankException extends java.lang.Exception {
    String message;

    public BankException(String message) {
        this.message = message;
    }

    public BankException() {
    }
}
