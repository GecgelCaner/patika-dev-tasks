import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        for (int i = 1 ; i<number ; i++){
            if(number % i == 0){
                toplam += i;
                System.out.print(i);
            }
        }
        if(number == toplam){
            System.out.print("Bu sayı mükkemmel sayıdır.");
        }else {
            System.out.print("Bu sayı mükkemmel sayı değildir");
        }
    }
}