public class poly {
    

    public static void main(String[] args) {
        Animal a = new Animal();
        dog d = new dog() ;
        d.eats();
        
        

    }
}

 class Animal{

    void eats(){
        System.out.println("this is animaal");

    }

    Animal(){
        System.out.println("Animal constructor is called ");
    }
 }

 class dog extends Animal{


    @Override
     void eats() {
     System.out.println("this is dog");
    }
 }
