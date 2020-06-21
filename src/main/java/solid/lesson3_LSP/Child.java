package solid.lesson3_LSP;

public class Child extends Parent{
    @Override
    public void doSmth() {
        throw new RuntimeException();
    }
}
