package BurgersChallenge;

public class Addition {
    protected String name;
    protected double price=0;

    public Addition(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
