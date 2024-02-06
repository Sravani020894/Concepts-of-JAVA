import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //creating a Hashset
        Set<String> mySet = new HashSet<>();

        //performing operations
        mySet.add("Red");
        mySet.add("White");
        mySet.add("Green");
        mySet.add("Blue");

        //Doesn't allow Duplicate values
        mySet.add("Red");

        //Iterating through set
        for(String itr : mySet){
            System.out.println(itr);
        }

    }
    
}
