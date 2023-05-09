import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kg ;
        double m ;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Kilogram(kg) : ");
        kg = input.nextDouble();
        System.out.print("Enter Size(m) : ");
        m = input.nextDouble();

        double bodyMossIndex = kg / (m * m ) ;
        System.out.println("Body Mass Index : " + bodyMossIndex);
    }
}