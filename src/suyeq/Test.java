package suyeq;

import javax.security.auth.kerberos.KerberosTicket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
//        new Kt();
//        System.out.println("未开启初始化的forName方法。。。。。。");
//        Class.forName("suyeq.Kt",false,Kt.class.getClassLoader());
//        System.out.println("开启初始化的forName方法。。。。。。");
//        Class.forName("suyeq.Kt",true,Kt.class.getClassLoader());
//        System.out.println("loadClass方法。。。。。。");
//        ClassLoader.getSystemClassLoader().loadClass("suyeq.Kt");
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(2);
        list1.add(2);
        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
       // list2.add(3);
        //list2.add(2);
        set.add(list1);
        set.add(list2);
        System.out.println(list2.containsAll(list1));

    }


}
