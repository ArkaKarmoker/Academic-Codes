public class Test {
    public static void main(String[] args) {
        double c[] = new double[3];

        Cat cat = new Cat();

        Cow cow = new Cow();

        System.out.println("Cats color is " + cat.getColor());
        System.out.println("Cats size is " + cat.getSize());
        System.out.println("Species is " + cat.getSpecies());

        System.out.println("Cows color is " + cow.getColor());
        System.out.println("Cows size is " + cow.getSize());
        System.out.println("Cows is " + cow.getSpecies());

        System.out.println("The cat parameters are " + cat.toString());
        System.out.println("The cow parameters are " + cow.toString());

    }
}