package BurgersChallenge;

public class HealthyBurger extends Hamburger {
    private Addition lettuce;
    private Addition cucumbers;

    public HealthyBurger(String name, String breadRollType, String meatType) {
        super(breadRollType, meatType);
        this.name = "Healthy Burger";
    }

    public void setLettuce() {
        lettuce = new Addition("Lettuce", 0.20);
        this.totalPrice += lettuce.price;
    }

    public void setCucumbers() {
        cucumbers = new Addition("Cucumbers", 0.30);
        this.totalPrice += cucumbers.price;
    }

    @Override
    public String additionDisplay() {
        String lettuceDisplay = getDisplay(lettuce);
        String cucumbersDisplay = getDisplay(cucumbers);

        String additionsDisplay = super.additionDisplay();

        return additionsDisplay + lettuceDisplay + cucumbersDisplay;
    }
}
