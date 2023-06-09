package grades;

import java.util.ArrayList;

public class Student {
    private String name;

    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    };

    public void addGrade(int grade){
        grades.add(grade);
    };

    public double getGradeAverage(){
        int sum = 0;
        for(Integer grade : grades){
            sum += grade;
        }
        return (double) sum / grades.size();
    };
}