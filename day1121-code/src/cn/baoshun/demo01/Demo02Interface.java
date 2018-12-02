package cn.baoshun.demo01;

/*
* 1、接口的默认方法可以通过接口的实现类对象进行调用
* 2、接口的默认方法，也可以被接口实现类进行覆盖重写
* */
public class Demo02Interface {

    public static void main(String[] args) {
        MyinterfaceDefaultA intfaceA = new MyinterfaceDefaultA();
        intfaceA.methodAbs();
        // 调用默认方法，如果实现类没有，就向上找接口的方法
        intfaceA.methodAbs2();
        System.out.println("======================");
        MyinterfaceDefaultB interB = new MyinterfaceDefaultB();
        interB.methodAbs2();
    }
}
