import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//      1a.  int i = 5;
//        while (i <= 15) {
//            System.out.print("i is " + i);
//            i++;
//        }

//        b. int i = 0;
//        do {
//            System.out.println("Iteration: " + i);
//            i += 2;
//        } while (i <= 100);

//        b1. int i = 100;
//        do {
//            System.out.println("Iteration: " + i);
//            i -= 5;
//        } while (i >= -10);

//        b2. long i = 2;
//        do {
//            System.out.println("i: "
//              i *= i;
//        } while (i <= 1000000);

//        c. for(int i = 100; i >= -10; i -= 5) {
//             System.out.println("Iteration: " + i);
//        }


//        c1. for(long i = 2; i <= 1000000; i *= 1) {
//            System.out.println("Iteration: " + i);
//        }


//       2. for(int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizzbuzz");
//        } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//        } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//        } else {
//                System.out.println(i);
//            }
//
//        }

        Scanner scanner = new Scanner(System.in);
//        boolean confirm = true;
//
//        do {
//            System.out.println("Enter a integer: ");
//            int userInfo = scanner.nextInt();
//
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//             System.out.println("------ | ------ | ------");
//
//            for(int i = 1; i <= userInfo; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
//
//                System.out.println("%-7s|%-9s|%-6s\n", i, square, cubed);
//            }
//
//            System.out.println("Do you want to continue? (yes/no)");
//            confirm = scanner.next().equalsIgnoreCase("y");
//        } while (confirm);
//        System.out.println("Perfect, till next time!");
//
//        scanner.close();

        boolean confirm = true;

        do {
            System.out.print("Enter a numerical grade (0-100): ");
            int userGrade = scanner.nextInt();

            String letterGrade;
            if (userGrade >= 90) {
                letterGrade = "A";
            } else if (userGrade >= 80) {
                letterGrade = "B";
            } else if (userGrade >= 70) {
                letterGrade = "C";
            } else if (userGrade >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }


            System.out.println("Letter grade: " + letterGrade);

            System.out.print("Do you want to continue? (yes/no): ");
           confirm = scanner.next().equalsIgnoreCase("yes");
        } while (confirm);
        System.out.println("Thank you!");

        scanner.close();
    }
}
