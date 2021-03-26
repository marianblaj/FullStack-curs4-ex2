package ro;

public record Cat(String name) implements Animal {

    @Override
    public String name() {
        return name;
    }

    @Override
    public String doSomething() {
        return "drink milk";
    }
}
