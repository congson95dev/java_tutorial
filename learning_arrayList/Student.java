package learning_arrayList;

public class Student {
    private int studentCode;
    private String name;

    public Student(int studentCode) {
        this.studentCode = studentCode;
    }

    public Student(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        // custom
        // only check for student code
        // because that's the purpose of the tutorial
        return studentCode == student.studentCode;
    }
}
