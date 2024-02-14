import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int sayi = input.nextInt();

        for(int i = sayi-1 ; i >= 0 ; i--){
            for(int k = 0 ; k <= i ; k++){
                System.out.print("*");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
