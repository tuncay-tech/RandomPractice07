import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        int yas, km, tip;
        Scanner girdi = new Scanner(System.in);
        System.out.print("yasınızı giriniz: ");
        yas = girdi.nextInt();
        System.out.print("gidilecek km giriniz: ");
        km = girdi.nextInt();
        System.out.print("yolculuk tipini seciniz (1: tek gidiş 2: gidiş dönüş: ");
        tip = girdi.nextInt();

        double normalFiyat, yasIndirimi,tipIndirimi;

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            normalFiyat = km * 0.10;
            if (yas < 12) {
                yasIndirimi = normalFiyat * 0.5;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalFiyat * 0.10;
            }else if (yas>=65){
                yasIndirimi = normalFiyat * 0.30;
            }else {
                yasIndirimi = 0;
            }
            // fiyattan indiirm sayısını çıkaralım 3 kere yapacağımıza bu şekilde de yapabiliriz yani
            //if dışına çıkarak hepsine eklemiş olup kodu kısaltmış oluruz
            normalFiyat = normalFiyat - yasIndirimi;

        if (tip == 2){
            tipIndirimi = normalFiyat * 0.20;
            normalFiyat = (normalFiyat -  tipIndirimi) * 2;
        }
            System.out.println("bilet tutarı : " + normalFiyat + "dolar");
        }
    }
}