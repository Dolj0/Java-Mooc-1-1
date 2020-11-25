
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you? ");
        int i = scan.nextInt();
        
        if (i < 0 || i > 120) {
            System.out.println("Impossible!");    
        } else {
            System.out.println("OK");
        }
        
    }
}
