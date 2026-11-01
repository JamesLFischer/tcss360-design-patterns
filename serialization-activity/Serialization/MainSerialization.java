import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerialization {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, 3.8, "secret123");
        Student s2 = new Student("Bob", 22, 3.6, "bobpass");

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            oos.writeObject(s1);
            oos.writeObject(s2);
            System.out.println("Objects serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("students.ser"))) {
            Student s3 = (Student) ois.readObject();
            Student s4 = (Student) ois.readObject();

            System.out.println("Objects deserialized:");
            System.out.println(s3);
            System.out.println(s4);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}