import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Step 1: Create a class that implements Serializable
class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializableInterface {
    public static void main(String[] args) {
        // Step 2: Create an object of Student
        Student s1 = new Student(101, "Jara");

        // Serialize the object
        try {
            FileOutputStream fout = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.close();
            fout.close();
            System.out.println("Object has been serialized");
        } catch (Exception e) {
            System.out.println(e);
        }

        // Deserialize the object
        try {
            FileInputStream fin = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student s2 = (Student) in.readObject();
            in.close();
            fin.close();
            System.out.println("Object has been deserialized");
            System.out.println("ID: " + s2.id + ", Name: " + s2.name);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
