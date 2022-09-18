public class Heptagon {
    private double side;
    public static int numOfHeptagon;

    public Heptagon() {
    }

    public Heptagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public static int getNumOfHeptagon() {
        return numOfHeptagon;
    }

    public static void setNumOfHeptagon(int numOfHeptagon) {
        Heptagon.numOfHeptagon = numOfHeptagon;
    }

    public void getArea(int a){
        double Area = (7/4) * (a*a) * (Math.toRadians(Math.cos(180/7))/Math.toRadians(Math.sin(180/7)));
    }
    public void getPerimeter(int a){
        double p = 7 * a;
    }
}
