package learning_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // handle ArrayList by Collections

        // generate ArrayList
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(4);
        array.add(6);
        array.add(9);
        array.add(1);

        // print
        for (Integer o : array) {
            System.out.println(o);
        }

        // sort
        Collections.sort(array);
        // print
        for (Integer o : array) {
            System.out.println(o);
        }

        // find max
        int max = Collections.max(array);
        System.out.println("max is: " + max);

        // find min
        int min = Collections.min(array);
        System.out.println("min is: " + min);

        // handle StudentList

        // generate empty StudentList
        StudentList studentList = new StudentList();

        // add data to StudentList
        Student student1 = new Student(1, "fudo1");
        studentList.addStudent(student1);
        Student student3 = new Student(3, "fudo3");
        studentList.addStudent(student3);
        Student student2 = new Student(2, "fudo2");
        studentList.addStudent(student2);

        // print list
        studentList.printListStudent();

        // check if empty
        System.out.println("studentList isEmpty: " + studentList.checkEmpty());

        // get size
        System.out.println("studentList size: " + studentList.getSize());

        // empty list
        studentList.emptyList();
        // print list => result: empty
        studentList.printListStudent();
        // add data again to StudentList
        studentList.addStudent(student1);
        studentList.addStudent(student3);
        studentList.addStudent(student2);
        // print list => result: 3 data inside studentList
        studentList.printListStudent();

        // sort by asc
        studentList.sortByAsc();
        System.out.println("student list after sort asc: ");
        studentList.printListStudent();

        // sort by desc
        studentList.sortByDesc();
        System.out.println("student list after sort desc: ");
        studentList.printListStudent();

        // check if student exists by code
        Student student = new Student(2);
        // result => true
        System.out.println("checkIfStudentExists: " + studentList.checkIfStudentExists(student));
        Student student4 = new Student(4);
        // result => false, because student with code 4 is not exists
        System.out.println("checkIfStudentExists: " + studentList.checkIfStudentExists(student4));

        // remove student from student list by code
        // result => true
        System.out.println("remove student: " + studentList.removeStudent(student));
        // result => false, because student with code 4 is not exists
        System.out.println("remove student: " + studentList.removeStudent(student4));

        // search by name
        System.out.println("search by name result:");
        studentList.searchByName("fudo2");


    }
}
