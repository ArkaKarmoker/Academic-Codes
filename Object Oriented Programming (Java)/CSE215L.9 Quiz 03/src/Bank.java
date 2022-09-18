class Banks
{
    public static void main(String[] args) {
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