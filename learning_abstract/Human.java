package learning_abstract;

// abstract class
public abstract class Human {
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

    // abstract function is a function which force us to define this function in the child class of this class
    // which mean this "sleep" method need to define in the Student class, because Student is extends from Human
    public abstract void sleep();
}
