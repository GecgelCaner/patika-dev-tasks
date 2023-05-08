import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int km;
        double  taxiPay;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Km : ");
        km = input.nextInt();

10
        taxiPay =( km * 2.20 )+ 10 ;

        taxiPay = (taxiPay <20 ) ? 20 : taxiPay;
        System.out.print("taxiPay : " + taxiPay);
    }
}