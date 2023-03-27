package learning_map;

import java.util.*;

public class Dictionary {
    // it have 2 type of Map, which is "TreeMap" and "HashMap"
    // for TreeMap, it will automatic sort the data inside the map
    // opposite of Treemap, HashMap won't sort the data inside the map
    private Map<String, String> dictionary = new TreeMap<String, String>();

    public String add(String key, String value) {
        return this.dictionary.put(key, value);
    }

    public void list() {
        if (this.dictionary.size() == 0) {
            System.out.println("There's no data in the dictionary");
        }
        for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public String remove(String key) {
        return this.dictionary.remove(key);
    }

    public String search(String key) {
        String value = this.dictionary.get(key);
        return value;
    }

    public void printKeys() {
        Set<String> keys = this.dictionary.keySet();
        System.out.println(Arrays.toString(keys.toArray()));
    }

    public int getSize() {
        return this.dictionary.size();
    }

    public void removeAll() {
        this.dictionary.clear();
    }
}
