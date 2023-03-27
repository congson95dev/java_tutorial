package learning_syntax;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Syntax {
    // fast syntax: type "main" and enter
    public static void main(String[] args) {
        // we could use int age = 30, but because of int in java is from [-2B, 2B],
        // so we can use byte instead, because it will only take [-128, 127]
        byte age = 30;

        // equal to int viewsCount = 123456789;
        int viewsCount = 123_456_789;

        // if we write like this, it gonna throw error because 3 billion is too much for integer variable
        // int viewsCount = 3_123_456_789;
        // so we need to change to long, with "L" at the end
        long viewsCount1 = 3_123_456_789L;

        // float have "F" at the end
        float price = 10.99F;

        boolean isA = true;

        // for the character that have only 1 letter, we use char
        // but for string, we use String
        char letter = 'A';
        String message = "  Hello" + "!";

        // handle string
        int len = message.length();
        boolean lastword = message.endsWith("!");
        int indexof = message.indexOf("e");
        String replace = message.replace("e", "a");
        String lower = message.toLowerCase();
        // trim only remove blank space at the start and end of the string, it didn't remove blank space at the middle
        String trim = message.trim();

        // result => Hello "Fudo"
        String message1 = "Hello" + " \"Fudo\"";

        // result => C:\Windows\...
        String path = "C:\\Windows\\...";

        Date now = new Date();


        // Array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        Arrays.toString(numbers);

        int[] numbers2 = {1, 2, 4, 3, 5};
        int alen = numbers2.length;
        Arrays.sort(numbers2);

        // copy array
        // there are 3 way to copy an array, and each way will have specific effect than each other

        int[] arr1 = {1, 2, 3};

        // 1st way: this way will copy full memory of the array
        // so if we change the variable of copied array, the original array will be affected
        int[] arr2 = arr1;
        arr2[0] = 100;

        // 2nd way: this way will only copy but not affect the original one
        int[] arr3 = arr1.clone();
        arr3[0] = 50;

        // 3rd way: this way is the same as 2nd way,
        // but will useful to copy some element inside the original array to new array
        int[] arr4 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr4, 0, arr1.length);
        arr4[0] = 30;

        // result:
        // arr1: [100, 2, 3]
        // arr2: [100, 2, 3]
        // arr3: [50, 2, 3]
        // arr4: [30, 2, 3]
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr4: " + Arrays.toString(arr4));


        // with this final, we can't change the value of it anymore
        // it will be treated as a constance
        final float PI = 3.14F;

        // result => 3
        int result1 = 10 / 3;
        // result => 3.3333333
        double result2 = (double) 10 / (double) 3;

        // parse string to int (same thing exists for Float, Double, Short ...)
        String x = "1";
        int y = Integer.parseInt(x) + 2;


        // Math function

        // result => 1
        int num = (int) Math.round(1.2);

        // result => 1
        int num1 = (int) Math.ceil(1.2);

        // result => 2
        int num2 = (int) Math.floor(1.2);

        // only work for 2 number
        int num3 = (int) Math.max(3, 4);

        // => some random like 32.0, 16.0, 7.0, 19.0 ...
        double num4 = Math.round((double) Math.random() * 100);


        // result => $123,456,789.12
        String result = NumberFormat.getCurrencyInstance().format(123456789.123);
        // result => 10%
        String result3 = NumberFormat.getPercentInstance().format(0.1);


        // Practice about System.in and System.out
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);


    }
}
