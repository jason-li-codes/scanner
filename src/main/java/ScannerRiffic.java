import java.util.Scanner;

public class ScannerRiffic {
    public static void main(String[] args) {

        // creates scanner called myScanner
        Scanner myScanner = new Scanner(System.in);

        // asks for a string of your name
        System.out.println("What is your name?");
        String name = myScanner.nextLine();

        // asks for a boolean
        System.out.printf("So %s is your name? True or False", name);
        boolean confirm = myScanner.nextBoolean();

        // short snarky if statement
        if (confirm) {
            System.out.println("Thanks.");
        }
        else
        {
            System.out.println("That's too bad. Anyways...");
        }

        // adds 2 integers using nextInt()
        System.out.println("I will add two integers. Give me the first number.");
        int numFirst = myScanner.nextInt();

        System.out.println("Give me a second number.");
        int numSecond = myScanner.nextInt();

        int sum = numFirst + numSecond;
        System.out.println("The sum of the two integers is " + sum);

        // eats the next line so enter is not stuck in the buffer (queue)
        myScanner.nextLine();


    }

    }






