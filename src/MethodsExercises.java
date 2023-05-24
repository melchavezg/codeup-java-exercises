import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        int userInput = getInteger(min, max);
        System.out.println("Valid input: " + userInput);
//        System.out.println(add(1, 2));
//        System.out.println(subtraction(2,1));
//        System.out.println(multiplication(3, 4));
//        System.out.println(division(12,2));
//        System.out.println(modulus(26,15));


    }

//    public static int add(int one, int two) {
//        return one + two;
//    }
//
//    public static int subtraction(int one, int two) {
//        return one - two;
//    }
//
//    public static int multiplication(int one, int two) {
//        return one * two;
//    }
//
//    public static int division(int one, int two) {
//        return one / two;
//    }
//
//    public static int modulus(int one, int two){
//        return one % two;
//    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do{
        System.out.println("Enter a number between" + min + "and " + max + ":");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Enter a number between " + min + "and " + max);
            scanner.next();
        }
        userInput = scanner.nextInt();
    } while (userInput < min || userInput > max);

        return userInput;

    }
}

