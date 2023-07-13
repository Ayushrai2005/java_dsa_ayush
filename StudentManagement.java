import java.util.*;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, String fatherName, int age, String department) {
        Student student = new Student(name, fatherName, age, department);
        students.add(student);
        System.out.println("Student " + name + " has been added");
    }

    public void printStudents() {
        System.out.println("List of all students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void searchStudent(String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student found:");
                System.out.println(student);
                found = true;
                return ; 
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void removeStudent(String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Student " + name + " has been removed");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public void countStudents() {
        int count = students.size();
        System.out.println("Total number of students: " + count);
    }

    public void clearStudents() {
        students.clear();
        System.out.println("All students have been cleared.");
    }

    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scnr = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to add a student.");
            System.out.println("Enter 2 to print the list of students.");
            System.out.println("Enter 3 to search for a student.");
            System.out.println("Enter 4 to remove a student.");
            System.out.println("Enter 5 to count the number of students.");
            System.out.println("Enter 6 to clear all students.");
            System.out.println("Enter 0 to exit");
            System.out.println("Choice: ");
            int choice = scnr.nextInt();
            scnr.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scnr.nextLine();
                    System.out.println("Enter father's name:");
                    String fatherName = scnr.nextLine();
                    System.out.println("Enter age:");
                    int age = scnr.nextInt();
                    scnr.nextLine();
                    System.out.println("Enter department:");
                    String department = scnr.nextLine();
                    management.addStudent(name, fatherName, age, department);
                    break;

                case 2:
                    management.printStudents();
                    break;

                case 3:
                    System.out.println("Enter name to search:");
                    String searchName = scnr.nextLine();
                    management.searchStudent(searchName);
                    break;

                case 4:
                    System.out.println("Enter name to remove:");
                    String removeName = scnr.nextLine();
                    management.removeStudent(removeName);
                    break;

                case 5:
                    management.countStudents();
                    break;

                case 6:
                    management.clearStudents();
                    break;

                case 0:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println();
        }
    }
}

class Student {
    private String name;
    private String fatherName;
    private int age;
    private String department;

    public Student(String name, String fatherName, int age, String department) {
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Father's Name: " + fatherName + ", Age: " + age + ", Department: " + department;
    }
    
}