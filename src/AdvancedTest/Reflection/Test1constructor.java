package AdvancedTest.Reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test1constructor {

    @Test
    public void testConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Cat> catClass = Cat.class;
        Constructor<Cat> constructor = catClass.getConstructor();
        System.out.println(constructor.getName()+"-------->"+constructor.getParameterCount());

        Constructor<Cat> constructor1 = catClass.getDeclaredConstructor(String.class, String.class, int.class);
        System.out.println(constructor1.getName()+"-------->"+constructor1.getParameterCount());

        Cat cat = constructor1.newInstance("xiaoju", "blue", 18);
        System.out.println(cat);

    }
}