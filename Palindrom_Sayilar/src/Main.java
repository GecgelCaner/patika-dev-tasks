import java.util.Scanner;

public class Main {
    static  boolean isPalindrom(int number){
      int temp = number , reverseNumber = 0, lastNumber;

      while (temp != 0){
          lastNumber = temp % 10;
          reverseNumber = reverseNumber*10 +lastNumber;
          temp /=10;
      }

      if(reverseNumber == number){
          System.out.println("This number is the polyndrome.");
          return  true;
      }else {
          System.out.println("This number is not the polyndrome.");
          return  false;
      }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = input.nextInt();

        System.out.print(isPalindrom(number));

    }
}