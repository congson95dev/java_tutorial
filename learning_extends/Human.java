package learning_extends;

public class Human {
    private String name;
    private int bornYear;

    public Human(String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public void eat() {
        System.out.println("Eat");
    }

    public void sleep() {
        System.out.println("I sleep 8 hours a day");
    }
}
