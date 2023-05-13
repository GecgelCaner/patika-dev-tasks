import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName , password , newPassword , choose;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz :");
        userName = input.nextLine();
        System.out.print("Parolayı giriniz");
        password = input.nextLine();

        if(userName.equals("caner") && password.equals("caner123")){
            System.out.println("Hesaba giriş yapılıyor...");
        }
        else {
            System.out.println("Parola hatalı");
            System.out.print("Parolayı yenilemek istermisiniz ? Evet - Hayır");
            choose =input.nextLine();
            switch (choose){
                case "Evet":
                    System.out.print("Yeni Parolanızı Giriniz");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password)){
                        System.out.print("Parola bir önceki parola ile aynı. Tekrar parola giriniz");

                    }else {
                        System.out.print("parola değiştirildi");
                    }
                    break;
                case "Hayır" :
                    System.out.print("parolayı tekrar deneyin");

            }
        }

            

            
        
    }
}