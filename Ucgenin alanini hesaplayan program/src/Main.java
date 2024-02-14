import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print(" üçgenin 1. kenarını giriniz : ");
        int kenar1 = input.nextInt();

        System.out.print(" üçgenin 2. kenarını giriniz : ");
        int kenar2 = input.nextInt();

        System.out.print(" üçgenin 3. kenarını giriniz : ");
        int kenar3 = input.nextInt();

        int cevre = (kenar1+kenar2+kenar3);

        int alan = (cevre/2) * ((cevre/2) - kenar1) * ((cevre/2) - kenar2) * ((cevre/2) - kenar3);

        System.out.println(" Ucgenin cevresi : " + cevre + " \n Ucgenin alanı : " + alan);
    }
}
