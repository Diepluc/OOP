import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * cus.
     */
    public void readCustomerList(InputStream in) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = "";
            Customer cus = null;
            while ((line = br.readLine()) != null) {
                List<String> info = Arrays.asList(line.split(" "));
                if (!line.contains(Account.CHECKING)
                        && !line.contains(Account.SAVINGS)) {
                    cus = new Customer();
                    int len = info.size();
                    String id = info.get(len - 1);
                    long idCus = Long.parseLong(id);
                    String name = "";
                    for (int i = 0; i < len - 1; i++) {
                        name += info.get(i) + " ";
                    }
                    cus.setIdNumber(idCus);
                    cus.setFullName(name.trim());
                    customerList.add(cus);
                } else if (line.contains(Account.SAVINGS)) {
                    String tk = info.get(0);
                    long t = Long.parseLong(tk);

                    String bal = info.get(2);
                    double b = Double.parseDouble(bal);
                    Account ac = new SavingsAccount(t, b);
                    cus.addAccount(ac);
                } else if (line.contains(Account.CHECKING)) {
                    String tk = info.get(0);
                    long t = Long.parseLong(tk);

                    String bal = info.get(2);
                    double b = Double.parseDouble(bal);
                    Account ac = new CheckingAccount(t, b);
                    cus.addAccount(ac);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * cus.
     */
    public String getCustomersInfoByNameOrder() {
        customerList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return c1.getFullName().compareTo(c2.getFullName());
            }
        });
        String info = "";
        for (int i = 0; i < customerList.size() - 1; i++) {
            info += customerList.get(i).getCustomerInfo() + "." + '\n';
        }
        int len = customerList.size() - 1;
        info += customerList.get(len).getCustomerInfo() + ".";
        return info;
    }

    /**
     * cus.
     */
    public String getCustomersInfoByIdOrder() {
        customerList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                if ((c1.getIdNumber() - c2.getIdNumber()) < 0) {
                    return -1;
                }
                return 1;
            }
        });
        String info = "";
        for (int i = 0; i < customerList.size() - 1; i++) {
            info += customerList.get(i).getCustomerInfo() + "." + '\n';
        }
        int len = customerList.size() - 1;
        info += customerList.get(len).getCustomerInfo() + ".";
        return info;
    }

    /**
     * cus.
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }

}
