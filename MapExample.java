import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        //creating HashMap
        Map<String,Integer> myMap = new HashMap<>();

        //Adding key-value pairs
        myMap.put("One",1);
        myMap.put("Two",2);
        myMap.put("Three",3);
        myMap.put("Four",4);

        //Accessing values by keys
        System.out.println("value for key 'TWO': " + myMap.get("Two"));

        //Iterating through Map
        for(Map.Entry<String, Integer> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
