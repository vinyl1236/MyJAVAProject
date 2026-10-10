package AdvancedTest.Practice1;

import org.junit.Test;

import java.io.IOException;

public class PracticeTest {
    @Test
    public void test() throws IOException, IllegalAccessException {

        Student s1 = new Student("xiaoming", 18, 180.5, 68, "football");
        Teacher t1 = new Teacher("xiaowang", 9000);

        Achieve.saveObject(s1);
        Achieve.saveObject(t1);
    }
}
