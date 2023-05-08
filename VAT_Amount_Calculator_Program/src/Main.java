import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double priceWithoutVat;
        Scanner inp = new Scanner(System.in);

        priceWithoutVat = inp.nextDouble();
        System.out.println("Enter The  Value  Without Vat :" + priceWithoutVat);

        double vat = priceWithoutVat >= 1000 ? 0.08 :0.18 ;
        System.out.println("vat : " + vat);

        double vatAmount =  priceWithoutVat*vat;
        System.out.println("vatAmount : " + vatAmount);

        double vatPrice = vatAmount + priceWithoutVat;
        System.out.println("vatPrice : " + vatPrice);
    }
}