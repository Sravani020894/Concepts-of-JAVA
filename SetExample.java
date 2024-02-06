import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        //creating a Hashset
        Set<String> mySet = new HashSet<>();

        // TreeSet with Integers
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(5);
        integerSet.add(3);

        // HashSet with Characters
        Set<Character> charSet = new HashSet<>();
        charSet.add('A');
        charSet.add('B');
    
        //performing operations
        mySet.add("Red");
        mySet.add("White");
        mySet.add("Green");
        mySet.add("Blue");

        //Doesn't allow Duplicate values
        mySet.add("Red");

        //Removing element from Integerset
        integerSet.remove(5);
        
        //Iterating through set
        for(String itr : mySet){
            System.out.println(itr);
        }

    }
    
}
