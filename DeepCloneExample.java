import java.io.*;

class DeepCopyUtil {
    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T deepCopy(T object) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(object);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bis);

            return (T) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class DeepCloneExample {
    public static void main(String[] args) {
        Address address = new Address("New York");
        Person originalPerson = new Person("John", address);

        // Deep copy using DeepCopyUtil
        Person clonedPerson = DeepCopyUtil.deepCopy(originalPerson);

        // Modify the cloned object
        clonedPerson.name = "Jane";
        clonedPerson.address.city = "Los Angeles";

        // Changes in the cloned object do not affect the original object
        System.out.println("Original Person: " + originalPerson.name + ", " + originalPerson.address.city);
        System.out.println("Cloned Person: " + clonedPerson.name + ", " + clonedPerson.address.city);
    }
}
