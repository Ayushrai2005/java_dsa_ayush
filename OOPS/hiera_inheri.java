public class hiera_inheri {
    

    public static void main(String[] args) {
      
        Mammals Ayush = new Mammals();
        Ayush.walk();


        Fish pirana = new  Fish() ;
        pirana.color = "Black";
        pirana.eat() ;
        pirana.swim();
        System.out.println(pirana.color);
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


class Mammals extends Animal{
   void walk(){
    System.out.println("They can walk");
   }
}


class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("CAN fly");
    }
}

class panchi extends Bird{
    void panch(){
        System.out.println("PAnchi cant fly -)");
    }

    
}