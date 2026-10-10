package AdvancedTest.Annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.SQLOutput;


public class MyAnnotationTest {
    @Test
    public void testclass() {
        Class<Demo> c = Demo.class;
        if (c.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation ann1 = c.getAnnotation(MyAnnotation.class);
            System.out.println(ann1.name());
            System.out.println(ann1.age());
        }

    }

    @Test
    public void testmethod() throws NoSuchMethodException {
        Class<Demo> c = Demo.class;
        Method m = c.getDeclaredMethod("xiaowang");
        if (c.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation ann1 = m.getAnnotation(MyAnnotation.class);
            System.out.println(ann1.name());
            System.out.println(ann1.age());
        }

    }
}