public class M_L_inheri {

    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.eat();
        doggy.legs = 4;
        System.out.println(doggy.legs);
        doggy.breaths();
        doggy.breed = "LEBRA" ;
        System.out.println(doggy.breed);

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

// multilevel
class Mammals extends Animal {
    int legs;
}

class Dog extends Mammals {
    String breed;
}