import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print(" Sayi giriniz : ");
        int elemanSayisi = input.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;

        for(int i = 0 ; i <= elemanSayisi/2 ; i++){
            System.out.print(" " + sayi1 + " " + sayi2);
            sayi1 += sayi2;
            sayi2 += sayi1;
        }
    }
}
