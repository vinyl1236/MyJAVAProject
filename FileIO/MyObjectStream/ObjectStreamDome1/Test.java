package FileIO.MyObjectStream.ObjectStreamDome1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("张三", 18,"aaa");
        Student s2 = new Student("李四", 18,"bbb");
        Student s3 = new Student("王五", 18,"ccc");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
        oos.writeObject(students);
        oos.close();
    }
}