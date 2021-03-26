package ro;

public sealed interface Animal permits Cat, Dog, Bird, Insects {
    String name();
    String doSomething();
}
