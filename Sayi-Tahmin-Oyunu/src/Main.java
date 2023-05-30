import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        int right = 0 ;
        int selected;
        int [] wrong = new int[5];
        int i = 0;
        boolean isWin = false;
        boolean isWrong = false;

        while(right < 5){
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if(selected < 0 || selected >100){
                System.out.println("Hatalı bir giriş yaptınız . Lütfen 0-100 arası bir değer giriniz.");

                if(!isWrong){
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşücektir.");
                }else {

                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız " + (5 - ++right) );
                }
                continue;

            }

            if(selected == number){
                System.out.println("Tebrikler. Doğru tahmin. Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            }else {

                wrong[i++] = selected;
                right++;
                System.out.println("Hatalı bir sayı girdiniz .");

                if(selected > number){
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakkınız : " + (5 - right));
            }




        }

        if (!isWin){
            System.out.println("Kaybettiniz ! ");
            if(!isWrong){
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }

        }




    }
}