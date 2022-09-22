import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int ppl = scan.nextInt();

        System.out.print("What's the tip precentage? (0 - 100): ");
        double tip = scan.nextInt()/100.0;

        double num   = 0.0;
        double total = 0.0;

        while (num >= 0) {
            total += num;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            num = scan.nextDouble();

        }
        System.out.println("The total is"+ total);


        scan.close();



    }
}
