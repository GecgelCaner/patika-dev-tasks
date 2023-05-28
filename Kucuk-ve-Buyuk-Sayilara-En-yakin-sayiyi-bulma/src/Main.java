import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dizinin eleman sayısını giriniz : ");
        int  n = input.nextInt();

        int [] numbers = new  int [n];
        System.out.println("Dizinin elemanlarını giriniz : ");

        for (int i=0 ; i < n ; i++){
            numbers [i] = input.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println( "En küçük sayıya yakın eleman : " + numbers[1]);
        System.out.println( "En büyük sayıya yakın eleman : " +  numbers[numbers.length - 2 ]);
    }
}