package ro;

public final class Parrot extends Bird{

    @Override
    public String name() {
        return "Parrot Name";
    }


    @Override
    public String doSomething() {
        return "Parrots wants to fly";
    }
}
