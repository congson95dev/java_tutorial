package learning_extends;

public class GoodStudent extends Student {
    public GoodStudent(String name, int born_year, String className, String schoolName) {
        super(name, born_year, className, schoolName);
    }

    public void earnReward() {
        System.out.println("Earn Reward");
    }
}
