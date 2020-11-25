
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        
        int i = scan.nextInt();
        
        if (i<5000) {
            System.out.println("No tax!");
        } else if (i>=5000 && i<25000) {
            double taxA = (100+(i-5000)*0.08);
            System.out.println("Tax: " + taxA);
        } else if (i>=25000 && i<55000) {
            double taxB = (1700+(i-25000)*0.1);
            System.out.println("Tax: " + taxB);
        } else if (i>=55000 && i<200000) {
            double taxC = (4700+(i-55000)*0.12);
            System.out.println("Tax: " + taxC);
        } else if (i>=200000 && i<1000000) {
            double taxD = (22100+(i-200000)*0.15);
            System.out.println("Tax: " + taxD);
        } else if (i>=1000000) {
            double taxE = (142100+(i-1000000)*0.17);
            System.out.println("Tax: " + taxE);
        }

    }
}
