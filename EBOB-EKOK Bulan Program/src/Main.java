import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("1 sayiyi giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = input.nextInt();

        int ebob = 1;

        for(int i = 1; i<=sayi1; i++){
            if(sayi1 % i == 0){
                if(sayi2 % i == 0){
                    ebob = i;
                }
            }
        }
        int ekok = (sayi1*sayi2) / ebob;
        System.out.println(" Ebob = " + ebob + "\n ekok = " + ekok);
    }
}
