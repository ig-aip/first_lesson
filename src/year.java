import java.util.Scanner;

public class year {

    public static void main(String[] args){

        System.out.println("Please input number of the month:");
        Scanner sc = new Scanner(System.in);

        int moun = sc.nextInt();

        if (moun >= 1 && moun <3 || moun == 12){
            System.out.println("Zima");
        }
        if (moun >= 3 && moun <6){
            System.out.println("Vesna");
        }
        if (moun >= 6 && moun <9 ){
            System.out.println("Leto");
        }
        if (moun >= 9 && moun <12){
            System.out.println("Osen");
        }
        if (moun > 12){
            System.out.println("durachek");
        }



    }
}
