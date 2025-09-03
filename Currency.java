import java.util.Scanner;

public class CurrencyBreakdown {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static Double getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        final int CENTS_IN_DOLLAR = 100;
        final int CENTS_IN_QUARTER = 25;
        final int CENTS_IN_DIMES = 10;
        final int CENTS_IN_NICKEL = 5;
        final int CENTS_IN_PENNY = 1;
        double monetary_amount= getIntInput("Enter a monetary amount: ");
        int Dollars = (int)(monetary_amount * 100)/100;
        System.out.println("Dollars: "+Dollars);
        int Quarters = (int)(monetary_amount * 100)%100/25;
        System.out.println("Quarters: "+Quarters);
        int Dimes = (int)(monetary_amount * 100)%100%25/10;
        System.out.println("Dimes: "+Dimes);
        int Nickels = (int)(monetary_amount * 100)%100%25%10/5;
        System.out.println("Nickels: "+Nickels);
        int Pennies = (int)(monetary_amount * 100)%100%25%10%5/1;
        System.out.println("Pennies: "+Pennies);

    }
}
