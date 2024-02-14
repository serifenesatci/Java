import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("fizik notunuzu giriniz : ");
        int fizik = input.nextInt();

        System.out.print("matematik notunuzu giriniz : ");
        int matematik = input.nextInt();

        System.out.print("kimya notunuzu giriniz : ");
        int kimya = input.nextInt();

        System.out.print("muzik notunuzu giriniz : ");
        int muzik = input.nextInt();

        System.out.print("turkce notunuzu giriniz : ");
        int turkce = input.nextInt();

        System.out.print("tarih notunuzu giriniz : ");
        int tarih = input.nextInt();

        double ortalama = (double) (fizik+matematik+kimya+muzik+turkce+tarih) / 6;

        if(ortalama >= 60){
            System.out.println("Gectiniz. Ortalamanız : " + ortalama);
        }else{
            System.out.println("kaldınız. Ortalamanız : " + ortalama);
        }
    }
}