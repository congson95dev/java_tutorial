package learning_constructor;

import java.util.Objects;

public class MyDate {
    private int day;
    private int month;
    private int year;

    // constructor method, this method must be the same as the class name
    // fast syntax: Code -> Generate -> Constructor -> Select All -> Ok
    public MyDate(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }

        if (day >= 1 && day <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }

        if (year >= 1) {
            this.year = year;
        } else {
            this.year = 1;
        }
    }

    // getter and setter
    // fast syntax: Code -> Generate -> Getter and setter -> Select All -> Ok
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if (day >= 1 && day <= 31)
            this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year >= 1)
            this.year = year;
    }

    // override toString function
    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    // check if 1 obj is equal to 1 obj
    // in java, we must set this manually
    // fast syntax: Code -> Generate -> equals and hash -> Select All -> Ok
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }

    // transfer an object to 1 hash code (don't know the purpose of it yet)
    // in java, we must set this manually
    // fast syntax: Code -> Generate -> equals and hash -> Select All -> Ok
    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    // when a function doesn't return anything, we use "void"
    public void printDay() {
        System.out.println("Day: " + this.day);
    }

    public void printMonth() {
        System.out.println("Month: " + this.month);
    }

    public void printYear() {
        System.out.println("Year: " + this.year);
    }

    // when a function return something, we don't need to use "void"
    public int dayAfterCount(int day) {
        return this.day + day;
    }
}
