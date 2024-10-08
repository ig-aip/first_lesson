package packet;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how much u have voashing things ");
        double voashingThings = sc.nextDouble();

        System.out.println("Input how tarelok u have");
        int tarelka = sc.nextInt();


        for (int i = 0; i < tarelka; i++){
            int counter = i;
            if (voashingThings >= 0.5) {
                System.out.println(++counter +"rd tarelka is clear");
                voashingThings -= 0.5;
                System.out.println("count voashing things:" + voashingThings);
            }else {
                System.out.println("U DONT HAVE ANY VOASHING THINGS u CANT WOASHING!!!!!");
            }
        }

    }
}
