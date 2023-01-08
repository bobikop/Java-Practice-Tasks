package JavaCorePractice;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {

        Dog myDog = new Dog("Ari", 7);
    }
}
