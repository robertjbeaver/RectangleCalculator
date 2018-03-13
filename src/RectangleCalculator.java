import java.util.Scanner;

public class RectangleCalculator {
    
    public static void main(String[] args) {
        // welcome the user
        System.out.println("Welcome to the Rectangle Calculator.\n");

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // start the choice loop
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            // get input from the user
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width:  ");
            double width = sc.nextDouble();
            double area = length * width;
            double perimeter = 2 * length + 2 * width;

            System.out.println("Area:  " + area);
            System.out.println("Perimeter:  " + perimeter);
          
            System.out.print("\nContinue? (Y/N): ");
            choice = sc.next();
            if (choice.equalsIgnoreCase("n"))
            	System.out.println("Bye!");
        }
        sc.close();
    }
}