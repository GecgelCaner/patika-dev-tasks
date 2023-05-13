import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi ;
        double Toplam = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();


        for( int i =0 ; i<= sayi ; i++ ){
            if(i%12 == 0){

                Toplam += i;

            }


        }
        System.out.println( Toplam );
    }
}