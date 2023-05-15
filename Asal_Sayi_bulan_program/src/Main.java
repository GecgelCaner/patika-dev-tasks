import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz : ");
        int number = input.nextInt();

        boolean prime = false;  // sayının bölünüp bölünmediğini kontrol etmek için boolen kullanıyorum.

        for(int i = 2 ; i < number ; i++){
            if(number % i == 0){
                prime = false;     // Sayı bölündüğü zaman if koşulu sağlanıcak  break ilede koşul bitirilecek.
                break;
            }else {
                prime =true;    // Sayı hiçbişeye bölünmediyse else kısmı çalışıcak ve prime true dönecek.
            }
        }

        if(prime){
            System.out.print(number + " asal sayıdır. ");   // prime true dönünce ekrana asal sayı yazdırıcak.
        }else {
            System.out.print(number + " asal sayı değildir");  //  prime false dönünce asal sayı değildir yazdırıcak.
        }




    }
}