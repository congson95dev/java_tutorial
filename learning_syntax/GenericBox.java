package learning_syntax;

// Generic is a feature of java, which lets us no need to define the correct type of column when we define the class
// syntax is: public class className<T>
public class GenericBox<T> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
