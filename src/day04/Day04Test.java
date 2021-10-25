package day04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Day04Test implements InvocationHandler {
    public static void main(String[] args) {
        String a="";
        String b="";
        here:
        for(int i =0;i<10;i++){
            a="位于外层的第"+i+"层";
            for(int j=0;j<10;j++){
                b="位于内层的第"+j+"层";
                if(i==5&&j==5){
                    break here;
                }
            }
        }
        System.out.println(a+b);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
