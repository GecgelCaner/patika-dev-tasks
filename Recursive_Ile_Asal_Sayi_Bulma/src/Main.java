import java.util.Scanner;

public class Main {

    static  int isPrime (int number , int border){
        // Girilen sayı 2'den küçükse asal sayı değildir.
        if(number<2){
            return 0;
        }
        // Border yani sınır 1 e kadar gidiyorsa asal sayıdır.
        if (border == 1) {
            return 1;
        }
        // Number border bölünüyorsa asal sayı değildir.
        if(number%border == 0) {
            return 0;
        }
        // border sürekli 1 azaltıp number 'a böldürüyorum.
        return isPrime(number , border-1);
    }

    public static void main(String[] args) {
        int prime;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        // isPrime dan gelen değeri prime eşitliyorum.
        prime = isPrime(number, number-1);

        if(prime == 1){
            System.out.print("This number is prime number!");
        }else {
            System.out.print("This number is not prime number!");
        }


    }


}