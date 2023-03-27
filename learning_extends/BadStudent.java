package learning_extends;

public class BadStudent extends Student{
    public BadStudent(String name, int born_year, String className, String schoolName) {
        super(name, born_year, className, schoolName);
    }

    public void earnPunished() {
        System.out.println("Earn Punished");
    }
}
