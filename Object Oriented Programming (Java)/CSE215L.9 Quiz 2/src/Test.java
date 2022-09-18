import java.util.Scanner;
public class test {

    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int x=8;
        Cellphone c[]=new Cellphone[x];
        double sum=0;

        for(int i=0;i<x;i++){
            System.out.println("Enter duration: ");
            double a=in.nextDouble();
            c[i] = new Cellphone(a);
            sum+=a;
        }
        double avg=sum/x;
        System.out.println("The average duration is "+avg);
    }

}