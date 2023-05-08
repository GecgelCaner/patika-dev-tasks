import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        /*
          Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

           𝑢 = (a+b+c) / 2

           Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        */

        double a , b ,c ;
        double u;

        Scanner inp = new Scanner(System.in);

        System.out.print("a kenarını giriniz : ");
        a = inp.nextDouble();
        System.out.print("b kenarını giriniz : ");
        b = inp.nextDouble();
        System.out.print("c kenarını giriniz : ");
        c = inp.nextDouble();

        u = (a + b + c)/2;
        System.out.println("Çevre : " + 2*u );

        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("alan : " + alan);

    }
}