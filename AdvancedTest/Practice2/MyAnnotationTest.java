package AdvancedTest.Practice2;


import AdvancedTest.Practice2.Myannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyAnnotationTest {
    @Myannotation
    public void test1(){
        System.out.println("test1");
    }

    //@Myannotation
    public void test2(){
        System.out.println("test2");
    }

    @Myannotation
    public void test3(){
        System.out.println("test3");
    }

    @Myannotation
    public void test4(){
        System.out.println("test4");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MyAnnotationTest annotationTest = new MyAnnotationTest();
        Class c = MyAnnotationTest.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Myannotation.class)){
                method.invoke(annotationTest);
            }
        }
    }
}
