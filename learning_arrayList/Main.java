package learning_arrayList;

public class Main {
    public static void main(String[] args) {
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
