public class Main {

    public static void main(String[] args) {
        Customer c = new Customer("John", "Doe");
        Account a = new Account(1000000);
        c.setAccount(a);
        c.getAccount().withdrawn(50000);
        System.out.println(c.getAccount().getBalance());
        Bank b = new Bank("BCA");
        b.addCustomer(c);
        b.addCustomer("mew","too");
        System.out.println(b.getNumberOfCustomers());
        System.out.println( b.getCustomer(0).getFirstName());


    }
}
