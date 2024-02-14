import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        int yaricap = input.nextInt();

        double alan = (double) yaricap*yaricap*Math.PI;

        double cevre = (double) 2*yaricap*Math.PI;

        System.out.println(" Dairenin alanı : " + alan + "\n Dairenin çevresi : " + cevre);

    }
}
