import java.util.Scanner;

public class Main {

    static int f(int n){
      if( n == 1 ||n == 2){
       return  1;
      }else {
         return f(n-1)+ f(n-2);
      }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number :");
        int n = input.nextInt();

        System.out.println(f(n));
    }
}