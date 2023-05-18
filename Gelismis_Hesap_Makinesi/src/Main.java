import java.util.Scanner;



public class Main {

    static int plus(int a , int b){
        int result = a+b;
        System.out.println("Toplama İşlemi : " + result);
        System.out.println();

        return  result ;
    }

    static int minus(int a , int b){
        int result= a-b;
        System.out.println("Çıkarma İşlemi : " + result);
        System.out.println();
        return result;
    }

    static int times(int a , int b){
        int result = a *b;
        System.out.println("Çarpma işlemi : " + result);
        return  result;
    }

    static  int divided (int a , int b){

        if(b == 0){
            System.out.println("b 0 dan büyük olmalıdır!");
            return 0;
        }
        int result = a/b;
        System.out.println("Bölme İşlemi : " + result);
        return  result;
    }

    static  int power (int a , int b){
        int result = 1;
        for (int i = 1 ; i <= b ; i++){
            result *= a;
        }
        System.out.println("Üs İşlemi : " + result);
        return  result;
    }

    static  int factorial(int a){
        int result = 1;
        for(int i =1; i<=a ; i++){
            result *= i;
        }
        System.out.println("Faktoriyel : " + result);
        return  result;
    }

    static  int mod (int a , int b){
        int result = a%b;
        System.out.println("Mod : "  + result);
        return  result;
    }

    static void rectangle(int a , int b){
        int result = 2*(a+b);
        System.out.println("Dikdörgenin Çevresi : " + result);
        int aria = a*b;
        System.out.println("Dikdörtgenin Alanı : " + aria);


    }



    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int select ;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        while(true){


            System.out.print("Bir işlem seçiniz : " );
            select = input.nextInt();

            if(select == 0) {
                break;

            }
            System.out.print("Enter First Number  : ");
            int a = input.nextInt();
            System.out.print("Enter Second Number : ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    plus(a,b);
                    break;

                case 2:
                    minus(a,b);
                    break;

                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    rectangle(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz");

            }


        }

    }
}






