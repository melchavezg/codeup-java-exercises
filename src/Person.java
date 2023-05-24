public class Person {
    private String name;

    public String getName () {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello () {
        System.out.println("Hello, " + name + "!");
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person mel = new Person ("Mel");
        System.out.println(mel.getName());
        mel.setName("Sara");
        System.out.println(mel.getName());
        mel.sayHello();
    }
}
