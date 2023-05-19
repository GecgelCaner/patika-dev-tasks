import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number , newNumber=0 , lastNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı giriniz : ");
        number = input.nextInt();
        int temp =number;
        while(temp != 0){
            lastNumber = temp % 10;
            newNumber += lastNumber;
            temp /= 10 ;
        }

        System.out.println(newNumber);
    }
}