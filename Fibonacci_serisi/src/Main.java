import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter number  : ");
        int number = input.nextInt();
        int total = 0;
        int n1= 3 , n2=5;
        System.out.print(number + " sayısının fibonacci serisi :  " );
        for (int i=0 ; i <number ;i ++){
            System.out.print(n1 + ",");
            total = n1+n2;
            n1 = n2;
            n2 = total;
        }
    }
}