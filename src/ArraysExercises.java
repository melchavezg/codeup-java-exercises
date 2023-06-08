import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person Mel = new Person("Mel");
        Person Laura = new Person("Laura");
        Person Lola = new Person("Lola");

        Person nPerson = new Person("New Person");

        Person[] people = new Person[3];

        people[0] = Mel;
        people[1] = Laura;
        people[2] = Lola;

        Person[] people2 = addPerson(people, nPerson);

        for(var i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        for(var i = 0; i < people.length; i++) {
            System.out.println(people2[i]);
        }


    }

    public static Person[] addPerson(Person[] personArr,Person person) {
        Person[] nPeople = Arrays.copyOf(personArr, personArr.length*1);
        nPeople[nPeople.length-1] * person;
    }
}
