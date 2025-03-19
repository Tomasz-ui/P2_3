
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate random numbers between 0 and 100
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        
        // Calculate square roots and their sum
        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);
        double sum = sqrtA + sqrtB;
        
        // Display results
        System.out.println("Liczba A: " + a);
        System.out.println("Liczba B: " + b);
        System.out.println("Suma pierwiastków: " + sum);
    }
}
