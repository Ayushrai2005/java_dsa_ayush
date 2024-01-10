


public class cpyConstruct  {
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("Alice", 30);

        // Create a copy using the constructor-based copy technique
        Person person2 = new Person(person1);

        // Display information about both persons
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("Person 2 (Copy):");
        person2.displayInfo();
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor-based copy
    public Person(Person original) {
        this.name = original.name;
        this.age = original.age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
