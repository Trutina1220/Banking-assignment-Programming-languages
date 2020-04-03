import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers ;
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String f, String l)
    {
        Customer c1 = new Customer(f,l);
        customers.add(c1);
        return true;
    }

    public boolean addCustomer(Customer cus )
    {
        this.customers.add(cus);
        return true;
    }

    public int getNumberOfCustomers()
    {
        return customers.size();
    }

    public Customer getCustomer(int index)
    {
        return customers.get(index);
    }
}
