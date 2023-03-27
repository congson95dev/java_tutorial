package learning_extends;

public class Main {
    public static void main(String[] args) {
        // in this example, we will learn about 3 type of extends in java
        // 1. single
        // with this, it's just class A extends class B
        // 2. multilevel
        // with this, class A extends class B, class B extends class C
        // 3. hierarchical
        // with this, class A and class B extends class C
        Human human = new Human("Fudo", 2021);
        human.eat();

        // 1. single
        // student extends human
        Student student = new Student("Fu the dude", 2021, "class 1", "school 1");
        student.study();
        // 2. multilevel
        // goodstudent extends student, student extends human
        GoodStudent goodStudent = new GoodStudent("Fu the dude good student", 2021, "class 1", "school 1");
        goodStudent.earnReward();
        // 3. hierarchical
        // goodstudent and badstudent extends student
        BadStudent badStudent = new BadStudent("Fu the dude bad student", 2021, "class 1", "school 1");
        badStudent.earnPunished();

        // learn about override
        human.sleep();
        student.sleep();
    }
}
