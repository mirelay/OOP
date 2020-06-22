package BurgersChallenge;

public class Hamburger {
    protected String name = "Hamburger";
    protected String breadRollType;
    protected String meatType;
    protected double basePrice;
    protected double totalPrice;
    protected Addition onion;
    protected Addition egg;
    protected Addition cheese;
    protected Addition tomato;

    public Hamburger(String breadRollType, String meatType) {
        this.name = "Hamburger";
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.basePrice = 3.00;
        this.totalPrice = basePrice;
    }

    public void setOnion() {
        this.onion = new Addition("Onion", 0.20);
        this.totalPrice += onion.price;
    }

    public void setEgg() {
        this.egg = new Addition("Egg", 0.50);
        this.totalPrice += egg.price;
    }

    public void setCheese() {
        this.cheese = new Addition("Cheese", 0.50);
        this.totalPrice += cheese.price;
    }

    public void setTomato() {
        this.tomato = new Addition("Tomato", 0.30);
        this.totalPrice += tomato.price;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTotalPrice() {
        return "Total price: $" + totalPrice;
    }

    public String burgerDisplay() {
        return meatType + " " + name + ": $" + basePrice + "\n";
    }

    public String additionDisplay() {
        String onionDisplay = getDisplay(onion);
        String eggDisplay = getDisplay(egg);
        String cheeseDisplay = getDisplay(cheese);
        String tomatoDisplay = getDisplay(tomato);

        return onionDisplay + eggDisplay + cheeseDisplay + tomatoDisplay;
    }

    public String getDisplay(Addition addition) {
        if(addition != null) {
            return addition.name + ": $" + addition.price + "\n";
        }
        return "";
    }

    public String totalDisplay() {
        return this.burgerDisplay() + this.additionDisplay() + this.getTotalPrice();
    }
}
