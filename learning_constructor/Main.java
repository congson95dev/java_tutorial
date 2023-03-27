package learning_constructor;

public class Main {
    public static void main(String[] args) {
        MyDate md = new MyDate(23, 02, 2023);
        md.printDay();
        md.printMonth();
        md.printYear();

        // result => 23
        System.out.println("Day: " + md.getDay());
        // result => 33
        System.out.println("Day after count: " + md.dayAfterCount(10));

        // result => 23
        System.out.println("Day: " + md.getDay());
        md.setDay(35);
        // result => 23
        // result is still the same because we have validator in setDay() function,
        // it only allow 1 -> 31, so 35 is invalid
        System.out.println("Day after setDay(35): " + md.getDay());

        System.out.println("Date toString: " + md.toString());

        MyDate md1 = new MyDate(23, 02, 2023);
        MyDate md2 = new MyDate(20, 02, 2023);
        MyDate md3 = new MyDate(23, 02, 2023);

        // result => false
        System.out.println("Compare md1 and md2: " + md1.equals(md2));
        // result => true
        System.out.println("Compare md1 and md3: " + md1.equals(md3));

        // result => 53948
        System.out.println("Hash code md1: " + md1.hashCode());
        // result => 51065 (difference from md1 because it have difference value)
        System.out.println("Hash code md2: " + md2.hashCode());
        // result => 53948 (same as md1 because it have the same value as md1)
        System.out.println("Hash code md3: " + md3.hashCode());
    }
}
