package ro;


public sealed class Bird implements Animal permits Parrot, Chicken {

    @Override
    public String name() {
        return "birdName";
    }

    @Override
    public String doSomething() {
        return "fly";
    }
}
