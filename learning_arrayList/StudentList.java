package learning_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// practice about ArrayList
public class StudentList {
    private ArrayList<Student> studentList;

    // this one is custom constructor, created for generate empty StudentList
    public StudentList() {
        this.studentList = new ArrayList<Student>();
    }

    // automatic constructor
    public StudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public boolean checkEmpty() {
        return this.studentList.isEmpty();
    }

    public void printListStudent() {
        if (this.checkEmpty()) {
            System.out.println("Don't have any student in the list");
        }

        for (Student student : studentList) {
            // with this, we need to generate the toString() in learning_collections/Student.java
            System.out.println(student);
        }
    }

    public int getSize() {
        return this.studentList.size();
    }

    public void emptyList() {
        this.studentList.removeAll(studentList);
        System.out.println("Remove all data from student list");
    }

    // with this, we need to generate the equals() in learning_collections/Student.java
    // and then add some custom code inside that function
    public boolean checkIfStudentExists(Student student) {
        return this.studentList.contains(student);
    }

    // with this, we need to generate the equals() in learning_collections/Student.java
    // and then add some custom code inside that function
    public boolean removeStudent(Student student) {
        return this.studentList.remove(student);
    }

    public void searchByName(String name) {
        for (Student student : studentList) {
            // this function run throught equals() in learning_collections/Student.java
            // but because we've override it so it can be run in checkIfStudentExists() and removeStudent()
            // so it won't work for this function anymore
            // still not figure how to solve this problem yet
            if (student.getName().indexOf(name) >= 0) {
                System.out.println(student);
            }
        }
    }

    public void sortByAsc() {
        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getStudentCode() > o2.getStudentCode()) {
                    return 1;
                } else if (o1.getStudentCode() < o2.getStudentCode()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    // to sort an array list in java, we need to write exactly like this structure
    public void sortByDesc() {
        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getStudentCode() < o2.getStudentCode()) {
                    return 1;
                } else if (o1.getStudentCode() > o2.getStudentCode()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
