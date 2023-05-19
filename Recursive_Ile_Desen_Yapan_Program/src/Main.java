import java.util.Scanner;
public class Main {

    static int dgmo(int number, int tempNumber, boolean isNumber) {
        System.out.println(number);
        if (number < 0 || number == 0 || !isNumber) {
            isNumber = false;
            if (number != tempNumber) {
                return dgmo(number + 5, tempNumber, isNumber);
            } else
                return 0;
        } else {
            return dgmo(number - 5, tempNumber, isNumber);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, tempNumber;
        System.out.print("Enter a number : ");
        number = inp.nextInt();
        dgmo(number, tempNumber = number, true);
    }
}