package LSP;

public class Sparrow extends Bird implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}