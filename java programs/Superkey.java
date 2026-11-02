// Parent class
class Animal {
    public Animal() {
        System.out.println("Animal constructor called");
    }
}

// Child class
class Dog extends Animal {
    public Dog() {
        super(); // Calls the constructor of the parent class (Animal)
        System.out.println("Dog constructor called");
    }
}

// Main class to test the above classes
public class Superkey {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // This will call the constructor of Dog class, which in turn calls the constructor of Animal class
    }
}
