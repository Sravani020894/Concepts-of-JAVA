import java.util.List;
import java.util.ArrayList;

public class ListExample{
    public static void main(String[] args){
        List<String> mylist = new ArrayList<>();

        //performing operations on list
        mylist.add("Orange");
        mylist.add("apple");
        mylist.add("Mango");

        //Allows Duplicate values
        mylist.add("Orange");

        //Accessing elements through index as it is ordered list
        System.out.println("First Element : "+ mylist.get(0));

        //Iterating through the list
        for(String itr : mylist){
            System.out.println(itr);
        }
    }
}