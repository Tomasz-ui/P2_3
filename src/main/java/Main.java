
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Podaj liczbę A: ");
        int a = scanner.nextInt();
        System.out.print("Podaj liczbę B: ");
        int b = scanner.nextInt();
        
        // Calculate square roots and their sum
        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);
        double sum = sqrtA + sqrtB;
        
        // Display results
        System.out.println("Suma pierwiastków: " + sum);
        
        scanner.close();
    }
}
