import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat ;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değeri giriniz : ");
        heat = input.nextInt();

        if (heat <= 5){
            System.out.print("Kayak yapmanız önerilir.");
        } else if ((heat>5) && (heat<=15)) {
            System.out.print("Sinemaya gitmeniz önerilir.");
        } else if ((heat>15) && (heat <=25)) {
            System.out.print("Piknik yapmanız önerilir. ");
        }else{
            System.out.println("Yüzme etkinliği yapmanız önerilir.");
        }
    }
}