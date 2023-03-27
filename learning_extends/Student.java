package learning_extends;

public class Student extends Human {
    private String className;
    private String schoolName;

    public Student(String name, int born_year, String className, String schoolName) {
        super(name, born_year);
        this.className = className;
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study() {
        System.out.println("Study");
    }

    // in java, to override, we will extends the parent class, then use decorator @Override before the parent function
    @Override
    public void sleep() {
        System.out.println("I only sleep 5 hours a day because i need to study hard");
    }
}
