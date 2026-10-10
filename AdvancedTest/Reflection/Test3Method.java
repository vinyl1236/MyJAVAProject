package AdvancedTest.Reflection;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test3Method {
    @Test
    public void testMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Cat> c = Cat.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName() + "------>" + m.getParameterCount() + "------>" + m.getReturnType());
        }
        System.out.println("-------------------");

        Method declaredMethod = c.getDeclaredMethod("run");
        System.out.println(declaredMethod.getName() + "------>" + declaredMethod.getParameterCount() + "------>" + declaredMethod.getReturnType());
        System.out.println("-------------------");

        Cat cat = new Cat();
        Object invoke = declaredMethod.invoke(cat);
        System.out.println(invoke);


    }
}
