class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}
//contains Reference of Address 
class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCloneExample {
    public static void main(String[] args) {
        Address address = new Address("New York");
        Person originalPerson = new Person("John", address);

        try {
            // Shallow clone
            // clone() in the Object class creates a shallow copy, 
            //which means that only the object's fields are copied, and references to other objects are retained.

            Person clonedPerson = (Person) originalPerson.clone();

            // Modify the cloned object
            clonedPerson.name = "Jane";
            clonedPerson.address.city = "Los Angeles";

            // Changes in the cloned object affect the original object
            System.out.println("Original Person: " + originalPerson.name + ", " + originalPerson.address.city);
            System.out.println("Cloned Person: " + clonedPerson.name + ", " + clonedPerson.address.city);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
