public class Cat extends Animal implements Feedable {

    String color;
    double size;
    String species;

    public Cat(String color, double size, String species, String color1, double size1, String species1) {
        super(color, size, species);
        this.color = color1;
        this.size = size1;
        this.species = species1;
    }

    public Cat() {
        super();
    }

    public Cat(String color, double size, String species) {
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

    }

    @Override
    public String HowToFeed() {
        return "Cat uses paws to feed";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", species='" + species + '\'' +
                '}';
    }
}
