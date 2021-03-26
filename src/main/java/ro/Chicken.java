package ro;

public non-sealed class Chicken extends Bird {

    @Override
    public String name() {
        return "Chicken Name";
    }


    @Override
    public String doSomething() {
        return "chicken don`t fly";
    }
}
