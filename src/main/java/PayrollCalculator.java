import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        // creates scanner
        Scanner myScanner = new Scanner(System.in);

        // asks for name first
        System.out.println("I'm a basic payroll calculator.\n" +
                "What is your name?");
        String name = myScanner.nextLine();
        System.out.printf("Hi, %s. ", name);

        // asks for hours and pay rate
        System.out.println("How many hours have you worked this week?");
        double hours = myScanner.nextDouble();
        System.out.println("How much is your pay rate?");
        double payRate = myScanner.nextDouble();

        // calculates gross pay with overtime taken into account
        double grossPay = 0;
        if (hours > 40)
        {
            grossPay = payRate * 40 +
                    payRate * 1.5 * (hours - 40);
        }
        else
        {
            grossPay = hours * payRate;
        }

        // prints gross pay
        System.out.printf("%s, your total gross pay is $%.2f", name, grossPay);

    }
}
