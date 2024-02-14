import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int sayi = input.nextInt();
        int fakt = 1;
        for(int i = 1 ; i <= sayi ; i++){
            fakt*= i;
        }
        System.out.println("Faktöriyeli : " + fakt);
    }
}
