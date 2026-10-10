package AdvancedTest.Junit;

public class StringUtil {

    public class StringUtil1 {
        public static void PrintNumber(String name) {
            if (name == null) {
                System.out.println(0);
                return;
            }
            System.out.println("长度是:" + name.length());
        }

        public static int GetMaxIndex(String data) {
            if (data == null) {
                return -1;
            }
            return data.length() - 1;
        }
    }
}
