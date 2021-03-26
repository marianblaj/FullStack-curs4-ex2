package ro;

public record LadyBug() implements Insects{
    @Override
    public String name() {
        return "lady bug name";
    }

    @Override
    public String doSomething() {
        return "fly very hard";
    }

    @Override
    public String makeAnotherSound() {
        return "loud bzzzz";
    }
}
