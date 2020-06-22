package Composition;

public class Main {
    public static void main (String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case ("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor ("27 inch Beast","Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("Z79-UD3H", "Gigabyte", 4, 6, "v1.03");

        PC thePC = new PC(theCase, motherboard, monitor);
        thePC.powerUp();

    }
}
