import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Question01 {  //  switch case ve ATM Örneği
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int bakiye = 1000;
        int islem;

        System.out.println("1 : Bakiye Görüntüle");
        System.out.println("2 : Para Yatırma");
        System.out.println("3 : Para Çekme");
        System.out.println("4 : Sistemden Çıkış");

        System.out.print("bir işlem numarası seçiniz: ");
        islem = girdi.nextInt();

        switch (islem) {
            case 1:
                System.out.print("bakiyeniz : " + bakiye + "TL dir");
                break;
            case 2:
                System.out.print("ne kadar yatıracaksınız : ");
                int miktar = girdi.nextInt();
                bakiye += miktar;
                System.out.print("bakiyeniz : " + bakiye + " TL dir");
                break;
            case 3:
                System.out.print("ne kadar çekeceksiniz : ");
                miktar = girdi.nextInt();
                bakiye -= miktar;
                System.out.print("bakiyeniz : " + bakiye + " TL dir");
                break;
            case 4:
                System.out.print("sistemden çıkılıyor");
            default:
                System.out.println("geçersiz işlem...");
                break;
        }
    }
}
