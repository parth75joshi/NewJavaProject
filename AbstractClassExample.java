abstract class Animal1 {
    abstract void makeSound();
    
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog1 extends Animal1 {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal1 myDog = new Dog1();
        myDog.makeSound();
        myDog.sleep();
    }
}
