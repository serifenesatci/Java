import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print(" tutarı giriniz : ");
        int tutar = input.nextInt();

        if(tutar <= 1000){
            double kdv = (double) tutar*18/100;
            System.out.println(" tutar :" + tutar + "\n kdv oranı : %18 \n kdv'li fiyat : " + (tutar+kdv));
        }else{
            double kdv = (double) tutar*8/100;
            System.out.println(" tutar :" + tutar + "\n kdv oranı : %8 \n kdv'li fiyat : " + (tutar+kdv));
        }
    }
}
