// public class OOPS{

//     public static void main(String[] args) {
//         Pen p1 = new Pen();  // created an pen object p1
//         p1.setColor ("blue");
//         System.out.println(p1.color);
//         p1.setTip(5);
//         System.out.println(p1.tip);
//         p1.setColor("yellow");
//         System.out.println(p1.color);
//     }
// }

// class Pen{
//     String color ;
//     int tip ;

//     void setColor(String newColor){
//         color = newColor ;
//     }
//     void setTip(int newTip){
//         tip = newTip ;
//     }
// }

// class Student{
//     String name ;
//     int age;
//     float percentage ;

//     void calcPercentage (int phy , int chem , int maths ){
//         percentage = (phy + maths + chem)/3 ;
//     }
// }

public class OOPS {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        // Setting values for car1
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;

        // Setting values for car2
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2019;

        car3.brand = "Maruti";
        car3.model = "dzire";
        car3.year = 2004;


        // Displaying information about the cars using their respective objects
        System.out.println("Car 1:");
        car1.displayInfo();

        System.out.println("\nCar 2:");
        car2.displayInfo();

         System.out.println("\nCar 3:");
        car3.displayInfo();

        Student s1 = new Student();
        s1.name = "ayush";
        s1.age = 17;

        // Providing subject scores for maths, phy, and chem
        int mathsScore = 80;
        int phyScore = 90;
        int chemScore = 70;

        // Calculating the percentage for the student
        s1.calcPercentage(mathsScore, phyScore, chemScore);

        // Displaying the calculated percentage
        System.out.println("Percentage of " + s1.name + ": " + s1.percentage + "%");
    }

}

// Class definition
class Car {
    // Data fields
    String brand;
    String model;
    int year;

    // Method to display information about the car
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Class definition for Student
class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int maths) {
        percentage = (phy + maths + chem) / 3.0f;
        System.out.println(percentage);
    }

}
