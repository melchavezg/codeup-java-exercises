import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bob: Hi there! How can I help you?");
        String answer;
        do {
            System.out.print("Interact with me");
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else {
                System.out.println("Bob: Whatever.");
            }
            System.out.println("would you like to continue? (y/n)");
            answer = scanner.next();
            scanner.nextLine();
        } while (answer.equalsIgnoreCase("y"));


        }
    }
}