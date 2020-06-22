package BurgersChallenge;

public class PremiumBurger extends Hamburger {
    private Addition fries;
    private Addition drink;

    public PremiumBurger(String breadRollType, String meatType) {
        super(breadRollType, meatType);
        this.name = "Premium Burger";

        fries = new Addition("French Fries", 0.50);
        this.totalPrice += fries.price;

        drink = new Addition("Coca Cola", 0.50);
        this.totalPrice += drink.price;
    }

    @Override
    public String additionDisplay() {
        String friesDisplay = getDisplay(fries);
        String drinkDisplay = getDisplay(drink);

        String additionsDisplay = super.additionDisplay();

        return additionsDisplay + friesDisplay + drinkDisplay;
    }
}
