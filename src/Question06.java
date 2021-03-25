import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {  // switch case ile yaptım
        Scanner girdi = new Scanner(System.in);
        String kullanıcıAdi, parola;
        System.out.print("kullanıcı adınızı giriniz: ");
        kullanıcıAdi = girdi.nextLine();
        System.out.print("parola giriniz: ");
        parola = girdi.nextLine();
        switch (kullanıcıAdi){
            case "java":
                System.out.println("kullanıcı adı doğru");
            case "123":
                System.out.println("parolanız doğru");
                break;
            default:
                System.out.println("kullanıcı adınız veya parolanız hatalı");
        }
    }
}
