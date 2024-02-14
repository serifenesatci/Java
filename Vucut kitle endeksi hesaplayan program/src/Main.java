import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz(metre cinsinden) : ");
        double boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        double indeks = kilo / (boy*boy);

        System.out.println("Vücut kitle endeksiniz : " + indeks);
    }
}
