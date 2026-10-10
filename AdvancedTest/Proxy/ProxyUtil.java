package AdvancedTest.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.reflect.Proxy.newProxyInstance;

public class ProxyUtil {
    public static Star createProxy(BigStar bigStar) {
        Star starProxy=(Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("sing".equals(method.getName())){
                            System.out.println("准备话筒，收钱20万");
                        }else if("dance".equals(method.getName())){
                            System.out.println("准备场地，收钱1000万");
                        }
                        return method.invoke(bigStar,args);
                    }
                });
        return starProxy;
    }
}
