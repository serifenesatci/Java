import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
        int yil = input.nextInt();

        if(yil % 4 == 0){
            if(yil % 100 == 0){
                if(yil % 400 == 0){
                    System.out.println("Girdiğiniz yıl artık yıldır.");
                }else{
                    System.out.println("Girdiğiniz yıl artık yıl değildir.");
                }
            }else{
                System.out.println("Girdiğiniz yıl artık yıldır");
            }
        }else{
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }
    }
}
