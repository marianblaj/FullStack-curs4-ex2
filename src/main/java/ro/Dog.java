package ro;

public final class Dog implements Animal {

    @Override
    public String name() {
        return "Spike";
    }

    @Override
    public String doSomething() {
        return "bite people";
    }
}
