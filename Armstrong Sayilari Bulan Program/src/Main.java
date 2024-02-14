import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int sayi = input.nextInt();
        int sayac = 0;
        int sonuc = 0;
        int geciciSayi = sayi;
        int geciciSayi2 = sayi;
        int toplam = 1;
        while(true){
            if(geciciSayi <= 0){
                break;
            }else{
                geciciSayi /= 10;
                sayac++;
            }
        }
        for(int i = 0; i < sayac; i++){
            int elde = geciciSayi2 %10;
            for(int j = 0 ; j< sayac ; j++){
                toplam *= elde;
            }
            sonuc+= toplam;
            toplam=1;
            geciciSayi2 /= 10;
        }
        if(sayi == sonuc){
            System.out.println("Girdiğiniz sayı armstrong sayıdır");
        }else {
            System.out.println("Girdiğiniz sayı armstrong sayı değildir");
        }
        System.out.println(sonuc);
    }
}