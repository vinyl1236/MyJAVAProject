package AdvancedTest.Practice1;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Achieve {
    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        FileWriter fw = new FileWriter("test.txt", true);
        Class<?> c = obj.getClass();
        Field[] declaredFields = c.getDeclaredFields();
        String simpleName = c.getSimpleName();
        fw.write("============" + simpleName + "============\n");
        for (Field field : declaredFields) {
            field.setAccessible(true);
            String name = field.getName();
            String Value = field.get(obj).toString();
            fw.write(name + "=" + Value + "\n");
        }
        fw.close();
    }
}
