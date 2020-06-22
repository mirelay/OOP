package BurgersChallenge;

public class Main {
    public static void main (String[] args) {
        PremiumBurger premiumBurger = new PremiumBurger("White bread", "Beef");
        premiumBurger.setCheese();
        premiumBurger.setEgg();
        premiumBurger.setOnion();
        //premiumBurger.setTomato();
        System.out.println(premiumBurger.totalDisplay());
    }
}
