import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1 , number2;
        int select ;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz : " );
        number1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        number2 = input.nextInt();

        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz :");
        select = input.nextInt();



        switch (select){

            case 1:
                System.out.print("Toplama İşlemi Sonucu : " + (number1 + number2));
                break;
            case 2:
                System.out.print("Çıkarma İşlemi Sonucu : " + (number1 - number2));
                break;
            case 3:
                System.out.print("Çarpma İşlemi Sonucu : " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0){
                    System.out.print("Bölme İşlemi Sonucu : " + (number1 / number2));
                }else{
                    System.out.print("Bölme İşleminde Sıfıra bölünme yoktur.");
                }
                break;
            default:{
                System.out.print("Hatalı giriş yaptınız. Tekrar deneyiniz");
            }
        }
    }
}