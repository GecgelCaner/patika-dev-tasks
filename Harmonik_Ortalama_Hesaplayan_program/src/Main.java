import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin Boyutu : ");
        int n = input.nextInt();

        double[]  numbers = new double[n];
        System.out.println("Dizinin Elemanlarını giriniz : ");

        for (int i = 0 ; i < numbers.length ; i++){

            numbers[i] = input.nextDouble();
        }

        double total = 0.0;

        for (int k = 0 ; k < numbers.length ; k++){

            total += 1 / numbers[k];
        }

        double harmonik = numbers.length / total;

        System.out.println(harmonik);
    }
}