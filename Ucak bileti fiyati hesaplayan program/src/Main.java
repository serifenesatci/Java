import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz(km):");
        double mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz:");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int tip = input.nextInt();

        double ucret = mesafe * 0.10;
        double indirimliUcret;
        if((mesafe > 0 && yas > 0) && (tip == 1 || tip == 2)){
            if(yas < 12){
                 indirimliUcret = ucret/2;
                 ucret=indirimliUcret;
            }
            else if(yas < 24){
                 indirimliUcret = (ucret - ucret/10);
                 ucret=indirimliUcret;
            }
            else if(yas >= 65){
                 indirimliUcret = (ucret - (ucret *3 /10));
                 ucret=indirimliUcret;
            }
            if(tip == 1){
                System.out.println("Bilet fiyatı : " + ucret);
            }else{
                ucret= 2 * (ucret - (ucret * 0.20));
                System.out.println("Bilet fiyatı : " + ucret);
            }
        }else{
            System.out.println("Hatalı veri girdiniz");
        }
    }
}
