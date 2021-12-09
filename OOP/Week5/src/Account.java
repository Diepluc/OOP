import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * nap tien.
     *
     * @param amount luong
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
            double converAmount = Math.round(amount * 100.0) / 100.0;
            double converBalance = Math.round(balance * 100.0) / 100.0;
            Transaction trans = new Transaction("Nap tien", converAmount, converBalance);
            transitionList.add(trans);
        }
    }

    /**
     * rut tien.
     *
     * @param amount rut tien
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (balance < amount) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            double converAmount = Math.round(amount * 100.0) / 100.0;
            double converBalance = Math.round(balance * 100.0) / 100.0;
            Transaction trans = new Transaction("Rut tien", converAmount, converBalance);
            transitionList.add(trans);
        }
    }

    /**
     * giao dich.
     *
     * @param amount    luong
     * @param operation ten giao dich
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * in giao dich.
     */
    public void printTransaction() {
        int len = transitionList.size();
        int k = 1;
        for (Transaction trans : transitionList) {
            String conAmount = String.format("%.2f", trans.getAmount());
            String conBalance = String.format("%.2f", trans.getBalance());
            String str = "Giao dich " + k + ": " + trans.getOperation() + " $" + conAmount
                    + ". So du luc nay: $" + conBalance + ".";
            System.out.println(str);
            k++;
        }
    }
}
