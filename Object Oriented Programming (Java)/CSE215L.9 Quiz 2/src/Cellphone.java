public class Cellphone {

    int SHORT=10,MEDIUM=20,LONG=30;
    private double call_duration;
    public static int numberOfCalls;
    Cellphone(){

    }
    Cellphone(double x){
        this.call_duration=x;
    }
    public int get_NoC()
    {
        return this.numberOfCalls;
    }
    public double get_CD()
    {
        return this.call_duration;
    }
    public void set_NoC(int x)
    {
        this.numberOfCalls=x;
    }
    public void set_CD(double x){this.call_duration=x;
    }

    public void makeCall()
    {
        System.out.println("Call is made.");
    }

    public void endCall()
    {
        System.out.println("Call is ended.");
    }

    public void getCallDuration()
    {
        System.out.println("Call duration is x");
    }


}