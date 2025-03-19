
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input and validate
        System.out.print("Podaj liczbę A: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj liczbę B: ");
        double b = scanner.nextDouble();
        
        // Check if numbers are negative
        if (a < 0 || b < 0) {
            System.out.println("Pierwiastek z liczby ujemnej jest liczbą zespoloną!");
            System.out.println("Nie można obliczyć sumy pierwiastków dla liczb ujemnych.");
        } else {
            // Calculate square roots and their sum
            double sqrtA = Math.sqrt(a);
            double sqrtB = Math.sqrt(b);
            double sum = sqrtA + sqrtB;
            
            // Display results
            System.out.println("Suma pierwiastków: " + sum);
        }
        
        scanner.close();
    }
}
