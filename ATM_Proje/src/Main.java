import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName , password;
        int right = 3;
        int select;
        int balance = 1500;



        Scanner input = new Scanner(System.in);
        while (right > 0){
            System.out.print("Kullanıcı Adı :");
            userName =input.nextLine();
            System.out.print("Parola :");
            password =input.nextLine();
            if((userName.equals("caner")) && (password.equals("123"))){
                System.out.println("X Bankasına Hoşgeldiniz.");

               do {
                   System.out.println("1-Para Yatırma\n" +
                           "2-Para Çekme{\n" +
                           "3-Bakiye Sorgulama\n" +
                           "4-Çıkış Yap");

                   System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                   select =input.nextInt();

                   switch (select){
                       case  1:
                           System.out.print("Yatırmak istediğiniz tutar : ");
                           int price = input.nextInt();
                           balance += price;
                           break;
                       case 2:
                           System.out.println("Çekmek istediğiniz tutar : ");
                           price = input.nextInt();
                           if(price > balance){
                               System.out.println("Bakiye Yetersiz");
                           }else {
                               balance -= price;
                           }
                           break;
                       case 3:
                           System.out.println("Bakiyeniz : " + balance);
                           break;
                   }
               }while(select != 4);
                System.out.println("Tekrar görüşmek üzere...");
                break;




            }else {
                --right;
                System.out.println("Kullanıcı Adı veya Parola Hatalı ! Lüffen Tekrar Deneyiniz.");
                if(right == 0){
                    System.out.println("Hesabınız bloke olmustur. En yakın X bankasına gidiniz. ");
                }else {
                    System.out.println("Kalan hakkınız  :" + right );
                }
            }
        }



    }
}