package Encapsulation;

public class Main {
    public static void main (String[] args) {
        Player player = new Player ();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.looseHealth(damage);

        System.out.println("Remaining damage: " + player.healthRemaining());

        damage = 11;
        player.looseHealth(damage);

        System.out.println("Remaining damage: " + player.healthRemaining());
    }
}