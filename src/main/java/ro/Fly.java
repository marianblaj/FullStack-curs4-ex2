package ro;

public class Fly implements Insects{
    @Override
    public String name() {
        return "Insect Name";
    }

    @Override
    public String doSomething() {
        return "Fly like an insect";
    }

    @Override
    public String makeAnotherSound() {
        return "Another buzz";
    }
}
