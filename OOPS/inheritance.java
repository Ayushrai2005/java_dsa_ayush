public class inheritance {

    public static void main(String[] args) {
        Fish shark = new Fish() ;
            shark.eat();
            shark.swim();
            shark.breaths();
        
    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breaths() {
        System.out.println("Breaths");
    }

}

// Derived class or //subclass

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}