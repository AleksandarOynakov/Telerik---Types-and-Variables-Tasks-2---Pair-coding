import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

    double halfLiterBottleDeposit = 0.1;
    double oneLiterBottleDeposit = 0.25;

    Scanner scanner = new Scanner(System.in);
    int halfLiterBottleCount = scanner.nextInt();
    int oneLiterBottleCount = scanner.nextInt();

    System.out.printf("%.2f", halfLiterBottleCount*halfLiterBottleDeposit + oneLiterBottleCount*oneLiterBottleDeposit);

    }

}