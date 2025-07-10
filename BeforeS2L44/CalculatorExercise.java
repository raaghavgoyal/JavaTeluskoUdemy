package BeforeS2L44;
import java.util.Scanner;

public class CalculatorExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";
        while(again.equalsIgnoreCase("y")){
            System.out.print("Enter first number: ");
            Double a = input.nextDouble();
            System.out.print("Enter second number: ");
            Double b = input.nextDouble();
            System.out.print("Choose operation (+,-,*,/): ");
            String c = input.next();
            if((c.equals("/")) && (b == 0.0)){
                System.out.print("Cannot divide by zero.");
                continue;
            }
            Double ans = 0.0;
            if(c.equals("+")) ans = a+b;
            else if(c.equals("-")) ans = a-b;
            else if(c.equals("*")) ans = a*b;
            else if(c.equals("/")) ans = a/b;
            System.out.println("Result: "+ans);
            System.out.print("Do you want to calculate again? (y/n)");
            again = input.next();
        }
        System.out.print("Thank you for using the calculator");

        // TODO: Use a while loop to keep calculating while 'again' is 'y'
        
        // TODO: Ask user for two numbers
        
        // TODO: Ask user for the operation (+, -, *, /)
        
        // TODO: Use if-else to perform the operation
        
        // TODO: Handle division by zero case
        
        // TODO: Ask if user wants to continue
        
        // TODO: Exit the loop and print a thank you message
        
    }
}
