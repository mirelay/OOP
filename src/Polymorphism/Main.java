package Polymorphism;

public class Main {
    public static void main (String[] args) {
        for(int i=1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #"+ i + ": " + movie.getName() + "\n" + " plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie () {
        int randomNumber = (int) (Math.random()*4) +1;
        System.out.println("Random number is " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new TheMazeRunner();
            case 4:
                return new StarWars();
            default:
               return null;
        }
    }
}
