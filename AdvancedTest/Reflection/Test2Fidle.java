package AdvancedTest.Reflection;

import org.junit.Test;

import java.lang.reflect.Field;

public class Test2Fidle {
    @Test
    public void testFidle() throws NoSuchFieldException, IllegalAccessException {
        Class<Cat> c = Cat.class;
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + ":" + field.getType());
        }

        Field declaredField = c.getDeclaredField("age");
        System.out.println(declaredField.getName() + ":" + declaredField.getType());

        Cat cat = new Cat();
        declaredField.set(cat,18);
        System.out.println(cat);

        Object o = declaredField.get(cat);
        System.out.println(o);
    }
}
