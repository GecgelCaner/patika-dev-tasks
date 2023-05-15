import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N1 Sayısını Giriniz : ");
        int N1 = input.nextInt();
        System.out.print("N2 Sayısını Giriniz : ");
        int N2 = input.nextInt();

        int ebob = 1;
        int ekok ;

        if(N1<N2){
            int i =1;
            while(i<=N1){
                i++;
                if(N1%i == 0 && N2%i == 0){
                    ebob =i;
                }
            }
        }else {
            int i= 1;
            while (i<=N2){
                i++;
                if(N2%i == 0 && N1%i==0){
                    ebob=i;
                }
            }
        }
        System.out.println("Ebob : " + ebob);

        int i = 1;
        while(i <= (N1*N2)){
            i++;
            if(i%N1 == 0 && i%N2 ==0){
                System.out.print("Ekok : " + i);
                break;
            }
        }
    }
}