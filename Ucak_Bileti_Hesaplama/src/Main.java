import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km , normalTutar , yasIndirimi , indirimTutar , tekYon ,gidisDonus ,toplamTutar;
        int yas , secim;


        Scanner input = new Scanner(System.in);

        System.out.print("Km giriniz :");
        km = input.nextDouble();
        normalTutar = km * 0.10;
        if(km<0){
            System.out.print("Hatalı veri girdiniz. Lütfen tekrar deneyin");
        }

        System.out.println("Normal Tutar : " + normalTutar  + " TL");

        System.out.print("Yasınızı Giriniz : ");
        yas = input.nextInt();
        if(yas<0){
            System.out.print("Hatalı veri girdiniz. Lütfen tekrar deneyin");
        }

        if(yas<12){
            yasIndirimi = normalTutar * 0.50;
        } else if ((yas>=12) && (yas<24) ) {
            yasIndirimi = normalTutar * 0.10;
        } else if ((yas >=24) && (yas<65)) {
            yasIndirimi = normalTutar;
        }else {
            yasIndirimi =normalTutar * 0.30;
        }
        System.out.println("Yaş indirimi :" + yasIndirimi + " TL");

        indirimTutar = normalTutar - yasIndirimi;
        System.out.println("İndirim Tutarı :" + indirimTutar + " TL");

        System.out.println("Yolculuk Tipi Seçiniz. ");

        System.out.print("Tek Yön => 1 / Gidiş-Dönüş => 2  : ");
        secim = input.nextInt();

        switch (secim){
            case 1:
                tekYon = indirimTutar;
                System.out.println("Tek Yön Uçak Bileti : " + tekYon + " TL");
                toplamTutar = tekYon;
                System.out.print("Toplam Tutar : " + toplamTutar + " TL");

                break;
            case 2:
                gidisDonus = indirimTutar * 0.20;
                System.out.println("Gidiş-Dönüş Uçak Bileti :" + gidisDonus + " TL");
                toplamTutar = (indirimTutar - gidisDonus) * 2 ;
                System.out.print("Toplam Tutar : " + toplamTutar + " TL");
        }


    }
}