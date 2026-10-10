package AdvancedTest.Proxy;

public class Test {
    public static void main(String[] args) {
        BigStar s = new BigStar("杨超越");
        Star proxy = ProxyUtil.createProxy(s);

        String rs = proxy.sing("XXX");
        System.out.println(rs);

        proxy.dance();

    }
}
