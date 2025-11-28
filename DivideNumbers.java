import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
