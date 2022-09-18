public class Cow extends Animal implements Feedable {


    String color;
    double size;
    String species;

    public Cow(String color, double size, String species, String color1, double size1, String species1) {
        super(color, size, species);
        this.color = color1;
        this.size = size1;
        this.species = species1;
    }

    public Cow() {
        super();
    }

    public Cow(String color, double size, String species) {
        super(color, size, species);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(double size) {
        super.setSize(size);
    }

    @Override
    public String getSpecies() {
        return super.getSpecies();
    }

    @Override
    public void setSpecies(String species) {
        super.setSpecies(species);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void food() {
        System.out.println("A Cow eats grass");
    }

    @Override
    public String HowToFeed() {
        return "Cow uses long neck to feed";
    }

    @Override
    public String toString() {
        return "Cow{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", species='" + species + '\'' +
                '}';
    }
}
