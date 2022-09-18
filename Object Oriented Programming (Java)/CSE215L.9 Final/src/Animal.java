public abstract class Animal {
    String color;
    double size;
    String species;

    public Animal() {
        color = "brown";
        size = 50;
        species = "lion";
    }

    public Animal(String color, double size, String species) {
        this.color = color;
        this.size = size;
        this.species = species;
    }

    if(size< 0)

    {
        System.out.println("WrongInputException");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", species='" + species + '\'' +
                '}';
    }

    public abstract void food();
}
