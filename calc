import java.util.*;

public class calc {

    int a;
    int b;

    calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1:");
        int a = sc.nextInt();

        System.out.println("Enter num2:");
        int b = sc.nextInt();

        while (true) {

            System.out.println("\nChoose option:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int c = sc.nextInt();

            switch (c) {

                case 1:
                    System.out.println("Addition: " + (a + b));
                    break;

                case 2:
                    System.out.println("Subtraction: " + (a - b));
                    break;

                case 3:
                    System.out.println("Multiplication: " + (a * b));
                    break;

                case 4:
                    if (b != 0) {
                        System.out.println("Division: " + (a / b));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;   // exits main method

                default:
                    System.out.println("Choose correct option!");
            }
        }
    }
}
