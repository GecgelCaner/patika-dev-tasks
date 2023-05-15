import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı giriceksiniz : ");
        int n = input.nextInt();
        int [] numbers = new int[n];  // kullanıcağım sayıları burada tutmak için dizi olusturdum.

        for(int i= 1 ; i <= n ; i++){
            System.out.print(i + ". sayı :");
            numbers [i -1] = input.nextInt();  // Yazdıgım sayıları dize içerisine gönderdim.
        }
        Arrays.sort(numbers); // Dize içerisindeki sayıları büyükten küçüğe sıraladım.

        System.out.println("En Küçük Sayı : " + numbers[0]);  // diziler 0. indexten başlar
        System.out.println("En Büyük Sayı : " + numbers[n-1]);  // dizeler 0. indexten başldıgı için son eleman n-1 dir.


    }
}