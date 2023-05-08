import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r;
        double π = 3.14;
        double angle;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        r = input.nextDouble();
        System.out.print("Enter Angle : ");
        angle = input.nextDouble();


        double circleSliceArea =  ( π *( r * r ) * angle) / 360 ;
        System.out.println("circleSliceArea :" + circleSliceArea );

    }
}