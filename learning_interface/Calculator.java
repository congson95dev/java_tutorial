package learning_interface;

// after declare this class implements from CalculatorInterface, it will throw error, click on it to import the interface function to this class
public class Calculator implements CalculatorInterface {

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiple(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }
}
