package Exercise;

public class Main {
    public static void main (String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());

        Cuboid cuboid = new Cuboid(4,5,6);
        System.out.println(cuboid.getVolume());
    }
}
