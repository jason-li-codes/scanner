import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // creates scanner
        Scanner myScanner = new Scanner(System.in);

        // asks for first and second number
        System.out.println("I'm a basic calculator.\n" +
                "Enter the first number.");
        double numFirst = myScanner.nextDouble();
        System.out.println("Enter the second number.");
        double numSecond = myScanner.nextDouble();

        // asks for operation
        System.out.println(
                """
                        Choose an operation:
                        (A)dd
                        (S)ubtract
                        (M)ultiply
                        (D)ivide"""
        );

        // takes the lowercased first character of whatever's entered
        String operatorStr = myScanner.next();
        char operatorChar = Character.toLowerCase(operatorStr.charAt(0));

        // if stating checking operation
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

        // prints answer
        System.out.printf("The answer is %f.", answer);


    }


}
