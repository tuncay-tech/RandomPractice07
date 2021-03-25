import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // Etkinlik Öneren Program
        // hava sıcaklığını ala
        // sıcaklık 30 ve üzeri ise yüzme etkinliği öner
        // 5 ile 30 arasında ise sinema öner
        // 4 den daha az ise kayak öner
        int sicaklik;
        Scanner girdi = new Scanner(System.in);
        System.out.print("hava sıcaklığını giriniz: ");
        sicaklik = girdi.nextInt();
        if (sicaklik > 30){
            System.out.print("bu havada yüzmeye gidilir");
        }else if (sicaklik<=30 && sicaklik >=5){
            System.out.print("bu havada en iyi sinemaya gidilir");
        }else {
            System.out.print("bu havada en iyi kayağa idilir");
        }

    }
}
