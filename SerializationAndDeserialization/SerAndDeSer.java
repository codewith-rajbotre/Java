
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements  Serializable{
       public int a ;
       public String b ;

       public Demo(int a, String b){
          this.a = a ;
          this.b = b;

       }
}


class SerAndDeser{
    public static void main(String[] args) {
        Demo s = new Demo(1, "ABC");
        String filename = "file.ser";

        //serialization in Java
        try {
            FileOutputStream fo = new FileOutputStream(filename);
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(s);
            os.close();
            fo.close();
            System.out.println("Object is serialized");
        } catch (Exception e) {
            System.err.println(e);
        }
       //deserialization in java
        Demo object1 = null;

        try {
            FileInputStream fi = new FileInputStream(filename);
            ObjectInputStream oi = new ObjectInputStream(fi);

            object1 = (Demo) oi.readObject();
            oi.close();
            fi.close();

            System.out.println("ID is :"+ object1.a);
            System.out.println("Name is :"+ object1.b);


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}