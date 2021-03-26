import ro.*;

public class main {
    public static void main(String[] args) {

        testAnimals(new Dog());
        testAnimals(new Cat("kitty"));
        testAnimals(new Bird());
        // testAnimals(new Canary("CanaryName"));
        testAnimals(new Parrot());
        testAnimals(new Chicken());
        testInsects(new Fly());
        testInsects(new LadyBug());

    }

    public static void testAnimals(Animal animal) {
        System.out.println(animal.name());
        System.out.println(animal.doSomething());
    }

    public static void testInsects(Insects animal) {
        System.out.println(animal.name());
        System.out.println(animal.doSomething());
        System.out.println(animal.makeAnotherSound());
    }
}
