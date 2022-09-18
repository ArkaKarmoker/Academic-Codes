public class Test{
    public static void main(String[] args) {
        double P = 1200;
        double r = 5;
        double t = 3;

        double CompoundInterest = P * (Math.pow (( 1 + r), t)) - P;

        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();
        bankA.getPercentage();
        bankA.getInterest();

        bankB.getPercentage();
        bankB.getInterest();

        bankC.getPercentage();
        bankC.getInterest();
    }
}