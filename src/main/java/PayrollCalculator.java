import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("I'm a basic payroll calculator.\n" +
                "What is your name?");
        String name = myScanner.nextLine();
        System.out.printf("Hi, %s. ", name);

        System.out.println("How many hours have you worked this week?");
        double hours = myScanner.nextDouble();
        System.out.println("How much is your pay rate?");
        double payRate = myScanner.nextDouble();

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

        System.out.printf("%s, your total gross pay is $%.2f", name, grossPay);

    }
}
