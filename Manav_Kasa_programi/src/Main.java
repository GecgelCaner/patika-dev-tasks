import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplam;

        System.out.print("Armut Kaç Kilo ? :");
        armutKg = inp.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = inp.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKg = inp.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKg = inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKg = inp.nextDouble();

        toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.println("Toplam Tutar : " + toplam + " TL");



    }
}