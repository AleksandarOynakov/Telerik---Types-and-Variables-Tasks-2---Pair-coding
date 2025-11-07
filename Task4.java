import java.util.Scanner;
import java.lang.Math;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.printf("%.0f%n" , a + b);
        System.out.printf("%.0f%n" , a - b);
        System.out.printf("%.0f%n" , a * b);
        System.out.printf("%.0f%n" , a % b);
        System.out.printf("%.0f" , Math.pow(a,b));

    }

}