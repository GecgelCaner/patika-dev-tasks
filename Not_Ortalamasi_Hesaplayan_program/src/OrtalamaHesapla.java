import java.util.Scanner;
public class OrtalamaHesapla {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int mat, fizik , kimya , turkce , tarih , muzik;

        System.out.print("Matamatik notunu giriniz : " );
        mat = inp.nextInt();

        System.out.print("Fizik notunu giriniz : " );
        fizik = inp.nextInt();

        System.out.print("Kimya notunu giriniz : " );
        kimya = inp.nextInt();

        System.out.print("Türkçe notunu giriniz : " );
        turkce = inp.nextInt();

        System.out.print("Tarih notunu giriniz : " );
        tarih= inp.nextInt();

        System.out.print("Müzik notunu giriniz : " );
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double ortalama = toplam / 6.0 ;
        System.out.println("Ortalamanız : " + ortalama);

        boolean OrtalamaHesapla = ortalama >= 60 ;

        String Hesapla = OrtalamaHesapla ? "Sınıfı Geçti" : " Sınıfta Kaldı";

        System.out.println(Hesapla);
    }
}