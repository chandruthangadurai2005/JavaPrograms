import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            String num1Str = scanner.nextLine();
            System.out.print("Enter second number: ");
            String num2Str = scanner.nextLine();

            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            System.out.println("Sum: " + (num1 + num2));

        } catch (NumberFormatException e) {
            System.out.println("Error: Wrong operand type. Please enter numeric values.");
            System.exit(1);
        } finally {
            scanner.close();
        }
    }
}






public class OddNumberChecker {
    public static void checkEven(int number) throws IllegalArgumentException {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("Error: The number is odd.");
        }
        System.out.println("The number " + number + " is even.");
    }

    public static void main(String[] args) {
        try {
            checkEven(4);
            checkEven(7); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}







import java.util.Scanner;

public class ArrayHandler {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an index (0-9): ");
            int index = scanner.nextInt();

            System.out.println("Value at index " + index + ": " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } finally {
            scanner.close();
        }
    }
}










// Custom exception class
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class CommandLineArgsHandler {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgument("Error: Less than five arguments provided.");
            } else {
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += Integer.parseInt(args[i]); // Assuming arguments are numbers
                }
                System.out.println("Sum of the first five arguments: " + sum);
            }
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: One of the arguments is not a number.");
        }
    }
}

