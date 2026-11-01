import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainManual {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, 3.8);
        Student s2 = new Student("Bob", 22, 3.6);

        try (FileWriter fw = new FileWriter("students.txt")) {
            fw.write(s1.toString() + "\n");
            fw.write(s2.toString() + "\n");
            System.out.println("Students saved manually.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Reading students from file:");

        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}