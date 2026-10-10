package FileIO.MyObjectStream.ObjectStreamDome2;

import FileIO.MyObjectStream.ObjectStreamDome1.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
        ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
        for (Student student : students) {
            System.out.println(student);
        }
        //students.forEach(System.out::println);
        ois.close();
    }
}
