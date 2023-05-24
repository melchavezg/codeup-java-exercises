//import java.util.Scanner;
//
//public class MethodsExercises {
//    private static final Scanner scanner = new Scanner(System.in);
//    private static final int MAX_INPUT_RANGE = 10;
//    public static void main(String[] args) {
//        int min = 1;
//        int max = 10;
//
//        System.out.println("Enter a number between 1 and 10!");
//        int userInput = getInteger(min, max);
//        System.out.println("Valid input: " + userInput);
////        System.out.println(add(1, 2));
////        System.out.println(subtraction(2,1));
////        System.out.println(multiplication(3, 4));
////        System.out.println(division(12,2));
////        System.out.println(modulus(26,15));
//
//        doSomeFactorial();
//
//    }
//
////    public static int add(int one, int two) {
////        return one + two;
////    }
////
////    public static int subtraction(int one, int two) {
////        return one - two;
////    }
////
////    public static int multiplication(int one, int two) {
////        return one * two;
////    }
////
////    public static int division(int one, int two) {
////        return one / two;
////    }
////
////    public static int modulus(int one, int two){
////        return one % two;
////    }
//
//    public static int getInteger(int min, int max) {
//        int userInput = scanner.nextInt();
//
//        if(userInput < min || userInput > max) {
//            System.out.println(" Invalid input, try again! ");
//            return getInteger(min, max);
//        }
//        return userInput;
//    }
//
//    private static boolean doSomeFactorial() {
//        while(true) {
//            System.out.println("Let's do a factorial!");
//            System.out.println("Enter an integer from 1 to " + MAX_INPUT_RANGE + " : ");
//
//            int factBase = getInteger(1, MAX_INPUT_RANGE);
//
//            System.out.println(fact(factBase));
//        }
//            private static boolean promptToContinue(){
//                System.out.println("Continue? y/n ");
//
//                String continueString = scanner.nextLine();
//
//                if (!continueString.equalsIgnoreCase("y")) {
//                    return false;
//            }
//                return true;
//        }
//    }
//
//    private static long fact(int factBase) {
//        long result = 1;
//        for (int i = factBase; i >= 2; i --) {
//            result *= i;
//        }
//        return result;
//    }



//}

