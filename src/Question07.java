import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        // bir öğrencinin türkçe,matematik,fen bilgisi, beden eğitimi notları girilsin
        // notların ortalamsını çıkar
        //  ortalama 50 göre kaldın geçtin ayarla

        int turkce, matematik, fenBilgisi, sosyalBilgisi, bedenEgitimi;
        double ortalama = 0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("türkçe notunu giriniz: ");
        turkce = girdi.nextInt();
        System.out.print("\nmatemaik notunu giriniz: ");
        matematik = girdi.nextInt();
        System.out.print("\nfenBilgisi notunu giriniz: ");
        fenBilgisi = girdi.nextInt();
        System.out.print("\nsosyalBilgisi notunu giriniz: ");
        sosyalBilgisi = girdi.nextInt();
        System.out.print("\nbedenEgitimi notunu giriniz: ");
        bedenEgitimi = girdi.nextInt();
        ortalama = (turkce + matematik + fenBilgisi + sosyalBilgisi + bedenEgitimi) / 5;

        if (ortalama < 50) {
            System.out.println("sınıfta kaldınız seneye görüşmek üzere " + " sınıf ortalamanız : " + ortalama);
        }else {
            System.out.println("tebrikler sınıfı başarıyla geçtiniz" + " sınıf ortalamanız : " + ortalama);
        }

    }
}
