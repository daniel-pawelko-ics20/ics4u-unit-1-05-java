/*
* Calulcate wood length
*
* @author  Daniel
* @version 1.0
* @since   2022-10-15
*/

import java.util.Scanner;

/**
* Program calulcates length of wood
*/
final class Main {

    /**
    * Prevent instantiation.
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * Function calculated length of wood.
    *
    * @param width width of wood
    * @param height height of wood
    * @return return length calculated
    */

    public static double boardFoot(double width, double height) {
        return 144/width/height;
    }

    /**
    * Program calculates microwave cook time.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // Defining variables
        final Scanner s = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter the widht(inch): ");
        String widthString = s.next();
        System.out.print("Enter the height(inch): ");
        String heightString = s.next();

        try {
            // Convert string to double
            final double widthNum = Double.valueOf(widthString);
            final double heightNum = Double.valueOf(heightString);

            if (widthNum <= 0 || heightNum <= 0) {
                System.out.println("Input must be positive");
            } else {
                // Calling function
                final double length = boardFoot(widthNum, heightNum);   

                // Output
                System.out.println("The wood should be " + length + " inch(es) long");
            }
        } catch (NumberFormatException ex) {
            // Exception
            System.out.println("Input invalid :(");
        } finally {
            // Done
            System.out.println("\nDone");
        }
    }
}

