import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("gidilen km : ");
        double km = input.nextDouble();

        double ucret = 10 + (km * 2.20);

        if(ucret <= 20){
            System.out.println("Taksimetre ücreti : 20tl");
        }else{
            System.out.println("Taksimetre ücreti : " + ucret + "tl");
        }
    }
}
