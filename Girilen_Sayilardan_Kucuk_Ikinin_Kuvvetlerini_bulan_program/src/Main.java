import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int sayi;
        int n = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        do {
            System.out.println(n);
            n *= 4;
        }while ( n <= sayi);

        System.out.println("---------------------------------------------------------");

        n = 1;

        do {
            System.out.println(n);
            n *= 5;
        }while ( n <= sayi);
    }
}