import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("üssü alınacak sayıyı giriniz : ");
        int sayi = input.nextInt();
        System.out.print("üssü giriniz : ");
        int sayiUssu = input.nextInt();
        int sonuc = 1;
        for(int i = 0 ; i < sayiUssu ; i++){
            sonuc *= sayi;
        }
        System.out.println("Sonuç : " + sonuc);
    }
}
