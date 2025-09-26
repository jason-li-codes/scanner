import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("I'm a basic calculator.\n" +
                "Enter the first number.");
        double numFirst = myScanner.nextDouble();
        System.out.println("Entre the second number.");
        double numSecond = myScanner.nextDouble();

        System.out.println(
                "Choose an operation:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide"
        );

        String operatorStr = myScanner.next();
        char operatorChar = operatorStr.charAt(0);

        double answer = 0;
        if (operatorChar == 'a')
        {
            answer = numFirst + numSecond;
        }
        else if (operatorChar == 's')
        {
            answer = numFirst - numSecond;
        }
        else if (operatorChar == 'd')
        {
            answer = numFirst / numSecond;
        }
        else {
            System.out.println("...I guess we're multiplying.");
            answer = numFirst * numSecond;
        }

        System.out.println("The answer is " + answer);


    }


}
