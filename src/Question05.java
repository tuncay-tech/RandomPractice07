import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {

        // kullanıcı girişli şifre ve kullanacıı adı girlmesi
        Scanner girdi = new Scanner(System.in);
        String kullanıcıAdi, parola;
        System.out.print("kullanıcı adınızı giriniz: ");
        kullanıcıAdi = girdi.nextLine();
        System.out.print("parola giriniz: ");
        parola = girdi.nextLine();
        if (kullanıcıAdi.equals("java") && parola.equals("123")){
            System.out.println("başarılı bir şekilde giriş yaptınız");
        }else {
            System.out.println("kullanıcı adınız veya parolanız hatalı");
        }
    }
}
