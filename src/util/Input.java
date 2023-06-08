package util;


import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo () {
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        }else {
            return false;
        }
    }

    public int getInt(){
        System.out.println("enter an integar value");
        String stringVal = getString();
        try {
            return Integer.valueOf(stringVal);
        }catch (NumberFormatException e){
            System.out.println("Not an integer");
            return getInt();
        }
    }

    public double getDouble() {
        System.out.println("Enter a double");
        String stringVal = getString();
        try {
            return Double.valueOf(stringVal);
        }catch (NumberFormatException e){
            System.out.println("not a double");
            return getDouble();
        }
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int userNum = Integer.valueOf(this.getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Error. Enter integer: ");
        return getInt(min, max, prompt);
    }

    public int getInt (int min, int max){
        int userNum = Integer.valueOf(this.getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        return getInt();
    }

    public static void main(String[] args) {
        Input inputOne = new Input();
        // System.out.println("Get String: ");
        // System.out.println(inputOne.getString());
       // System.out.println("yesNo: ");
       // System.out.println(inputOne.yesNo());
        System.out.println("Input a number between 1 - 10: ");
//        System.out.println(inputOne.getDouble(1, 10, "an integer between 1-10"));
    }
}
