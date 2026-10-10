package AdvancedTest.Junit;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testPrintNumber() {
        StringUtil.StringUtil1.PrintNumber("admin");
        StringUtil.StringUtil1.PrintNumber(null);
    }

    @Test
    public void testGetMaxIndex() {
        System.out.println(StringUtil.StringUtil1.GetMaxIndex("admin"));
        System.out.println(StringUtil.StringUtil1.GetMaxIndex(null));
        Assert.assertEquals("有bug", 4, StringUtil.StringUtil1.GetMaxIndex("admin"));
    }
}
