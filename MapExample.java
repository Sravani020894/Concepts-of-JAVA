import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapExample {
    public static void main(String[] args) {
        //creating HashMap
        Map<String,Integer> myMap = new HashMap<>();

        // LinkedHashMap with Integer keys and String values
        Map<Integer, String> integerStringMap = new LinkedHashMap<>();
        integerStringMap.put(3, "Three");
        integerStringMap.put(4, "Four");

        //Adding key-value pairs
        myMap.put("One",1);
        myMap.put("Two",2);
        myMap.put("Three",3);
        myMap.put("Four",4);

        // Removing key-value pairs
        myMap.remove("One");

        //Accessing values by keys
        System.out.println("value for key 'TWO': " + myMap.get("Two"));

        //Iterating through Map
        for(Map.Entry<String, Integer> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
