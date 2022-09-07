package Function_Array;

import java.util.HashMap;

public class MyHashmap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        // Add keys and values (Country, City)
        hashMap.put("England", "London");
        hashMap.put("Germany", "Berlin");
        hashMap.put("Norway", "Oslo");
        hashMap.put("USA", "Washington DC");
        System.out.println(hashMap);
        System.out.println(hashMap.get("USA"));
    }
}
