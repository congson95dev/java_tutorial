package learning_map;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        // add data
        dictionary.add("hello", "world");
        dictionary.add("hello1", "world1");
        dictionary.add("hello2", "world2");

        // print
        dictionary.list();

        // remove
        dictionary.remove("hello1");
        // print after removed
        System.out.println("data after removed:");
        dictionary.list();

        // search by key
        String key = "hello2";
        System.out.println("value of \"" + key + "\" is : " + dictionary.search(key));

        // print all keys
        System.out.println("print all keys:");
        dictionary.printKeys();

        //size
        System.out.println("size of dictionary: " + dictionary.getSize());

        dictionary.removeAll();
        dictionary.list();
    }
}
