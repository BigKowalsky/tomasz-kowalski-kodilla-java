package orderService;

public class User {
    private String name;
    private String surname;
    private String emailAddress;

    public User(String name, String surname, String emailAddress) {
        this.name = name;
        this.surname = surname;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
