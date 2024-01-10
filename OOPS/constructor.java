public class constructor {

    public static void main(String[] args) {

        // Student s1 = new Student("Ayushh");
        // System.out.println(s1.name);
        Student s1 = new Student();
        System.out.println();
    }
} 

class Student {
    String name;
    int rollno;

    // Student(String name) {
    //     this.name = name;

    // }

    Student(){
        System.out.println("Constructor is called ....");
    }

}