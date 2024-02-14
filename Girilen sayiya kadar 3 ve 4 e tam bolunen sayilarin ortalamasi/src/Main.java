import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        int sayac = 1;
        int toplam = 0;
        int toplamSayi = 0;
        while(true){
            if(sayac > sayi){
                break;
            }else{
                if(sayac % 12 == 0){
                    toplam += sayac;
                    sayac++;
                    toplamSayi++;
                }else{
                    sayac++;
                }
            }
        }
        double ortalama =(double) toplam / toplamSayi;
        System.out.println("Ortalama : " + ortalama);
    }
}
