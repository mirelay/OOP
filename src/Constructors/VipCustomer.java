package Constructors;

public class VipCustomer {
    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("Bobi Petrov", 10000.0, "bobi@email.com");
    }

    public VipCustomer(String name, String email) {
        this(name, 10000.0, email);
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
        System.out.println("Name of client is " + name +", Credit limit is " + limit + ", email of the client is " + email);
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
