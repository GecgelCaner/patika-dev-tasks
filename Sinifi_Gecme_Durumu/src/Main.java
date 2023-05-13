import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int mat, fizik, turkce, kimya, muzik ;

        Scanner input = new Scanner(System.in);

        System.out.print("Matamatik notu : ");
        mat = input.nextInt();

        if((mat<0) || (mat>100)){
            mat = 0;
        }

        System.out.print("Fizik notu : ");
        fizik = input.nextInt();
        if((fizik<0) || (fizik>100)){
            fizik = 0;
        }

        System.out.print("Türkçe notu : ");
        turkce = input.nextInt();
        if((turkce<0) || (turkce>100)){
            turkce = 0;
        }

        System.out.print("Kimya notu : ");
        kimya = input.nextInt();
        if((kimya<0) || (kimya>100)){
            kimya = 0;
        }

        System.out.print("Müzik notu : ");
        muzik = input.nextInt();
        if((muzik<0) || (muzik>100)){
            muzik = 0;
        }


        double average = (mat + fizik + kimya + turkce + muzik) / 5;


        if (average < 55 ){
            System.out.println("Sınıfta kaldınız");
        }else {
            System.out.println("sınıfı geçtiniz");
        }

        System.out.println( "Ortalamanız : " + average);
    }
}