import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {  // bir de switch caseler ile yaptık

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

        switch ((int) secim) {
            case 1:
                System.out.println("toplam: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("çıkarma: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("çarpma: " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 == 0) {
                    System.out.println("2. sayıyı 0 girdiğinizden sonuç belirsizdir");
                } else {
                    System.out.println("bölme: " + (sayi1 / sayi2));
                    break;
                }
        }
    }
}