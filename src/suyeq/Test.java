package suyeq;

import javax.security.auth.kerberos.KerberosTicket;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-20
 * @time: 18:42
 */
class Kt{

    static Kt kt=new Kt();
    static{
        System.out.println("加载了3。。。。");
    }

    {
        System.out.println("加载了。。。。");
    }
    public Kt(){
        System.out.println("加载了2。。。。");
    }

    static void ttt(){
        System.out.println("llllll");
    }

}

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        new Kt();
//        System.out.println("未开启初始化的forName方法。。。。。。");
//        Class.forName("suyeq.Kt",false,Kt.class.getClassLoader());
//        System.out.println("开启初始化的forName方法。。。。。。");
//        Class.forName("suyeq.Kt",true,Kt.class.getClassLoader());
//        System.out.println("loadClass方法。。。。。。");
//        ClassLoader.getSystemClassLoader().loadClass("suyeq.Kt");
    }


}
