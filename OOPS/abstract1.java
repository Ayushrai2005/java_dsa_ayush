public class abstract1 {
    public static void main(String[] args) {
        horse h = new horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();

        // animal a = new animal() //cant use this abstract class


        System.out.println(h.color);

        h.changecolor("Bhura");
        System.out.println("Horse color " + h.color);

    }

}

abstract class animal {
    String color;

    animal() {
     color = "Brown";
    }

    void eat() {
        System.out.println("animal eats ");
    }

    abstract void walk();
}

class horse extends animal {

    void changecolor(String Newcolor) {
        color = Newcolor ;


    }

    void walk() {
        System.out.println("Waks on  legs");
    }

}

class chicken extends animal {

    void changecolor() {
        color = "BR Yellow";

    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
