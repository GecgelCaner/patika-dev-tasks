import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();

        for(int i = 0 ; i <= n ; i++ ){

            for(int k = 1 ; k<=(n-i) ; k++){
                System.out.print(" ");
            }
            for(int j= 1 ; j <= (2*i-1) ; j++){
                System.out.print("*");
            }

            System.out.println("");
        }
        for (int i = n-1 ; i >= 0 ; i--){
            for (int a = 0 ; a< n- i; a++){
                System.out.print(" ");
            }for(int b =0 ; b < (2*i)-1 ; b++){
                System.out.print("*");
            }
            System.out.println("");
        }







    }
}