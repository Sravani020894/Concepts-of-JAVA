import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class ListExample{
    public static void main(String[] args){
        List<String> mylist = new ArrayList<>();

        try {
            // This may throw IndexOutOfBoundsException if the list is empty
            String firstElement = mylist.get(0);
            System.out.println("First element: " + firstElement);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The list is empty.");
        }

        //performing operations on list
        mylist.add("Orange");
        mylist.add("apple");
        mylist.add("Mango");

         // LinkedList with Integers
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);

        // ArrayList with Doubles
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);
    
        //Allows Duplicate values
        mylist.add("Orange");
        // Removing elements
        mylist.remove("apple");

        //Accessing elements through index as it is ordered list
        System.out.println("First Element : "+ mylist.get(0));

        //Iterating through the list
        for (String fruit : mylist) {
            System.out.println(fruit);
            // Concurrent modification: adding a new element while iterating
            //mylist.add("Grapes");  // This line will throw ConcurrentModificationException
        
    }
    // Using an explicit Iterator to avoid ConcurrentModificationException
    Iterator<String> iterator = mylist.iterator();
    while (iterator.hasNext()) {
        String fruit = iterator.next();
        System.out.println(fruit);
        // Safe removal during iteration
        iterator.remove();
    }
    System.out.println("List after removal: " + mylist);
}
}