import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo : ");
        double armut = input.nextDouble();

        System.out.print("Elma kaç kilo : ");
        double elma = input.nextDouble();

        System.out.print("Domates kaç kilo : ");
        double domates = input.nextDouble();

        System.out.print("Muz kaç kilo : ");
        double muz = input.nextDouble();

        System.out.print("Patlıcan kaç kilo : ");
        double patlican = input.nextDouble();

        double fiyat = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5);

        System.out.print("toplam fiyat : " + fiyat);
    }
}
