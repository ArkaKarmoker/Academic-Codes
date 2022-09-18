abstract class Bank
{
    public abstract void  getPercentage();
    public abstract void  getInterest();

}
class BankA extends Bank
{
    @Override
    public void getPercentage() {
        System.out.println("Interest is 5%");
    }

    @Override
    public void getInterest() {
        System.out.println("$1200 has been deposited.");
    }
}
class BankB extends Bank
{
    @Override
    public void getPercentage() {
        System.out.println("Interest is 6.5%");
    }

    @Override
    public void getInterest() {
        System.out.println("$1700 has been deposited.");
    }
}
class BankC extends Bank
{
    @Override
    public void getPercentage() {
        System.out.println("Interest is 7.5%");
    }

    @Override
    public void getInterest() {
        System.out.println("$2100 has been deposited.");
    }
}