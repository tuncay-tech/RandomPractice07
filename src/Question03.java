import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {  // benim yaptığım  if else ile yaptık
        Scanner girdi = new Scanner(System.in);
        double sayi1, sayi2, secim;
        System.out.print("1. sayıyı giriniz: ");
        sayi1 = girdi.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2 = girdi.nextInt();
        System.out.println("\nlütfen yapmak istediğiniz işlemleri seçiniz: ");
        System.out.println("1- toplama\n2- çıkarma\n3- çarpma\n4- bölme");
        System.out.print("seçiminiz: ");
        secim = girdi.nextInt();
        if (secim == 1) {
            System.out.println("toplam sonuc: " + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("çıkarma sonuç: " + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("çarpma sonucu: " + (sayi1 * sayi2));
        } else if (secim == 4) {
            if (sayi2 == 0) {
                System.out.println("ikinci sayı 0 eşittir ve sonuç belirsizdir");
            } else {
                double bölme;
                bölme = sayi1 / sayi2 ;
                System.out.println("bölme sonucu: " + bölme);
            }
            } else{
            System.out.println("geçersiz bir işlem girdiniz");
        }
    }
}
