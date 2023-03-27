package learning_interface;

public interface CalculatorInterface {
    // in interface, we can define abstract or non-abstract function
    public int plus(int a, int b);

    public abstract int minus(int a, int b);

    public abstract int multiple(int a, int b);

    public abstract int division(int a, int b);
}
