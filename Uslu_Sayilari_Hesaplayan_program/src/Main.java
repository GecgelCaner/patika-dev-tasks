import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a , b ;
        int total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı : ");
        a = input.nextInt();
        System.out.print("Üs olucak sayı : ");
        b = input.nextInt();

        for (int i= 1; i<=b ;i++){
            total *= a;

        }
        System.out.print("Çarpım : " + total);
    }
}