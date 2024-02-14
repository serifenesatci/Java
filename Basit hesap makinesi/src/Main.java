import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println(" 1--> toplama \n 2 --> çıkarma \n 3--> çarpma \n 4--> bölme \n 0--> çıkış ");

        while(true){
            System.out.print("Yapmak istediğiniz işlem : ");
            int secim = input.nextInt();

            if(secim == 0) {
                System.out.println("Program sonlandırıldı...");
                break;
            }
            System.out.print("1. sayıyı giriniz : ");
            double sayi1 = input.nextDouble();
            System.out.print("2. sayıyı giriniz : ");
            double sayi2 = input.nextDouble();

            if(secim == 1){
                double toplam = sayi1 + sayi2;
                System.out.println("Toplam : " + toplam);
            }else if(secim == 2){
                double sonuc = sayi1-sayi2;
                System.out.println("Sonuç : " + sonuc);
            }else if(secim == 3){
                double carpim = sayi1*sayi2;
                System.out.println("Çarpım : " + carpim);
            }else if(secim == 4){
                double bolme = sayi1/sayi2;
                System.out.println("Sonuç : " + bolme);
            }else{
                System.out.println("Yanlış seçim yaptınız tekrar seçiniz.");
            }

        }
    }
}
