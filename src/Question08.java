import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        // gitmek istenen mesafe
        // km başı 0.1 dolar
        // 12 yasından küçükse toplam fiyattan %50 indirim yap
        // 12 ile 24 yaşında ise %10 luk inidirm yap
        // 65 de büyükse %30 luk inidirm yap
        // gidiş dönüş alınırsa %20 indiirm yap
        // bu koşulara uyan ucak biletini hesapla

        int yas, km, tip;
        Scanner girdi = new Scanner(System.in);
        System.out.print("yasınızı giriniz: ");
        yas = girdi.nextInt();
        System.out.print("gidilecek km giriniz: ");
        km = girdi.nextInt();
        System.out.print("yolculuk tipini seciniz (1: tek gidiş 2: gidiş dönüş: ");
        tip = girdi.nextInt();

        double normalFiyat, yasIndirimi, tipIndirimi;

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            normalFiyat = km * 0.10;  // km hesapladık şimdi de eğer diyerk yaşını hesaplayalım
            if (yas < 12) {
                yasIndirimi = normalFiyat * 0.5;   // indirim oranı hesaplyıruz
                normalFiyat = normalFiyat - yasIndirimi;  // fiyattan indiirm sayısını çıkaraım
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalFiyat * 0.10;
                normalFiyat = normalFiyat - yasIndirimi;

            } else if (yas >= 65) {
                yasIndirimi = normalFiyat * 0.30;
                normalFiyat = normalFiyat - yasIndirimi;

            } else {
                yasIndirimi = 0;
            }
            if (tip == 2) {
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat - tipIndirimi) * 2;
            }
            System.out.println("bilet tutarı : " + normalFiyat + "dolar");
        } else {
            System.out.println("girdiğiniz bilgier eksik veya yanlış lütfen tekrar deneyiniz");
        }


    }
}
