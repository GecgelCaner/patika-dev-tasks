import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        double total = 0.0;
        for (double i = 1 ; i <= sayi ; i++  ){

            total += (1 / i);
        }
        System.out.print("Cevap : " + total );
    }
}