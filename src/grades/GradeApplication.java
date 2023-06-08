package grades;

import util.Input;

import java.util.HashMap;

public class GradeApplication {

    private static HashMap<String,Student> students;

    public static void main(String[] args){
        students = makeStudents();
        printWelcome();
        printChoice();

    }

    private static void printChoice() {
        String userInput = "";
        do {
            System.out.println("What student would you like to see more information on?");
            Input in = new Input();
            String userChoice = in.getString();

            if (students.containsKey(userChoice)) {
                System.out.println("Name: " + students.get(userChoice).getName() + "- GitHubUsername: " + userChoice);
                System.out.println("Current Average: " + students.get(userChoice).getGradeAverage());
            } else {
                System.out.println("Sorry, that doesn't match anyone in our database");
                System.out.println("Would you like to continue? (y for yes and n for no");
                userInput = in.getString();
            }
        }while(userInput.equalsIgnoreCase("y"));
        System.out.println("goodbye");
    }


    private static HashMap<String, Student> makeStudents() {
        HashMap<String, Student> student = new HashMap<>();
        Student Mel = new Student("Mel");
        Mel.addGrade(60);
        Mel.addGrade(70);
        Mel.addGrade(80);
        Student Connie = new Student("Connie");
        Connie.addGrade(60);
        Connie.addGrade(70);
        Connie.addGrade(80);
        Student Bri = new Student ("Bri");
        Bri.addGrade(60);
        Bri.addGrade(70);
        Bri.addGrade(80);

        students.put("Mel", Mel);
        students.put("Connie",Connie);
        students.put("Bri", Bri);

        return students;
    }

    private static void printWelcome(){
        System.out.println("Welcome here are the Github usernames of out Students:");

        for (String key: students.keySet()){
            System.out.printf("|%s|", key);
        }

        }

    }

}
