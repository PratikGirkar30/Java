import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number (Num1): ");
            String inputNum1 = sc.nextLine();
            System.out.print("Enter the second number (Num2): ");
            String inputNum2 = sc.nextLine();
            int num1 = Integer.parseInt(inputNum1);
            int num2 = Integer.parseInt(inputNum2);
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers. " + e.getMessage());
        
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. " + e.getMessage());
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds. " + e.getMessage());
        
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        
        }
    }
}
