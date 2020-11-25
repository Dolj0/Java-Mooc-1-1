
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int i = Integer.valueOf(scanner.nextLine());
    
        System.out.println("Give the second number: ");
        int j = Integer.valueOf(scanner.nextLine());
        
        int a = (int) Math.round(i);
        int b = (int) Math.round(j);
        double c = i;
        double d = j;
        
        double k = (c/d);
        
        System.out.println((a)+" + "+b+" = "+(a+b));
        System.out.println((a)+" - "+b+" = "+(a-b));
        System.out.println((a)+" * "+b+" = "+(a*b));
        System.out.println((a)+" / "+b+" = "+k);
    }
}
