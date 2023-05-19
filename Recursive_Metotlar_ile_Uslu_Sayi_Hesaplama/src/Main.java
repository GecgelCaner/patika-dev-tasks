import java.util.Scanner;

public class Main {

    static  int power(int base , int top){

         // üslü sayının taban kısmı bir oldugunda ve üs kısmı sıfır oldugunda 1 döndürür.
        if(base == 1 || top == 0){
            return 1;
        }
        return base*(power(base , top-1));  //  tabanı sabit tutup üssü bir azaltırız.

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // girilicek taban ve üs değerlerini kullanıcıdan almak için
        System.out.print("Enter the base number :  ");
        int base = input.nextInt();
        System.out.print("Enter the top number :  ");
        int top = input.nextInt();

        // cevabu ekrana bastırmak için
        System.out.println("Result : " + power(base , top) );
    }
}