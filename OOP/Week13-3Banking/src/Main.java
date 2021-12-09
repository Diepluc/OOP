import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Main {
    /**
     * test.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Bank bank = new Bank();
        InputStream in = new FileInputStream("test.txt");
        bank.readCustomerList(in);
        String s = bank.getCustomersInfoByNameOrder();
        String s2 = bank.getCustomersInfoByIdOrder();
        List<Customer> customers = bank.getCustomerList();
        List<Account> accountList = customers.get(2).getAccountList();
        Account ac = accountList.get(0);
    }
}
