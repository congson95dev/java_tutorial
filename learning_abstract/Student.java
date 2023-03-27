package learning_abstract;

// after declare this class extends from Human, it will throw error, click on it to import the abstract function to this class
public class Student extends Human{
    public Student(String name, int bornYear) {
        super(name, bornYear);
    }

    // define this class here because it's abstract function in the Student class
    @Override
    public void sleep() {
        System.out.println("I sleep 5 hours a day");
    }
}
