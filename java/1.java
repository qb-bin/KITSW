import java.util.*;
class Arithmetic {
public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the 'a' value: ");
    int a = scanner.nextInt();
    System.out.print("Enter the 'b' value: ");
    int b = scanner.nextInt();
    System.out.println("Addition: " + (a + b));
    System.out.println("Subtraction: " + (a - b));
    System.out.println("Multiplication: " + (a * b));
    System.out.println("Division: " + (a / b));
    System.out.println("Modulus: " + (a % b));
  }
}
