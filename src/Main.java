import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int ppl = scan.nextInt();

        System.out.print("What's the tip precentage? (0 - 100): ");
        int tip = scan.nextInt();

        double num   = 0.0;
        double total = 0.0;

        while (num >= 0) {
            total += num;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            num = scan.nextDouble();

        }
        double totalTip =(tip/100.0)*total;
        double ttb = (1+(tip/100.0))*total;
        String totalFormat = formatter.format(total);
        String totalTipFormat = formatter.format(totalTip);
        String totalBillTip = formatter.format(ttb);
        String ppbt = formatter.format(total/ppl);
        String tpp = formatter.format(totalTip/ppl);
        String tcp = formatter.format(ttb/ppl);

        System.out.println("------------------------------------");

        System.out.println("Total bill before Tip: "+ totalFormat);

        System.out.println("Tip Percentage: "+ tip);

        System.out.println("Total Tip: " + totalTipFormat);

        System.out.println("Total Bill with Tip: "+totalBillTip);

        System.out.println("Per Person Cost Before Tip:  "+ ppbt);

        System.out.println("Tip Per Person:  "+ tpp);

        System.out.println("Total Cost Per Person: "+ tcp);


        scan.close();



    }
}
