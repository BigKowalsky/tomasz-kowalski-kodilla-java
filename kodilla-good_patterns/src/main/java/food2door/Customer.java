package food2door;

public class Customer {
    private String name;
    private String emailAddress;

    public Customer(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
