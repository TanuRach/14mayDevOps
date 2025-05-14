class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class AnimalSoundDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        System.out.print("Dog says: ");
        myAnimal.makeSound();  

        myAnimal = new Cat();
        System.out.print("Cat says: ");
        myAnimal.makeSound();  

        myAnimal = new Animal();
        System.out.print("Generic Animal says: ");
        myAnimal.makeSound();  
    }
}
