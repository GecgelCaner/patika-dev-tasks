import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int n , r , c ,a ;
        int nFaktoriyel =1 , rFaktoriyel=1 , fFaktoriyel=1 ;

        Scanner input = new Scanner(System.in);

        System.out.print("n Faktöriyel   : ");
        n = input.nextInt();
        System.out.print("r Faktöriyel  :  ");
        r = input.nextInt();


        // n için faktöriyel hesaplama

        for (int i = 1 ; i <= n ; i++){
            nFaktoriyel *= i;
        }


        // r için faktöriyel hesaplama

        for (int i = 1 ; i <= r ; i++){
            rFaktoriyel *= i;
        }




        // fark için faktöriyel hesaplama

        for (int i = 1 ; i <= (n - r ) ; i++){
            fFaktoriyel *= i;
        }


        c = nFaktoriyel / (rFaktoriyel * fFaktoriyel);
        System.out.print(c);

        // Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!) */


    }
}