import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        int sayac = 1;

        while(true){
            if(sayac == sayi){
                break;
            }else{
                if(sayac % 2 == 0){
                    System.out.print(sayac + " ");
                    sayac++;
                }else{
                    sayac++;
                }
            }
        }
    }
}
