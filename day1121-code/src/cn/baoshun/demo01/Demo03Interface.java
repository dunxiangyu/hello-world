package cn.baoshun.demo01;

/*
* 注意：不能通过接口实现类的对象来调用接口中的静态方法
* 正确用法：通过接口名称直接调用其中的静态方法
* */
public class Demo03Interface {

    public static void main(String[] args) {
        MyinterfaceStaticImpl staticImpl = new MyinterfaceStaticImpl();
//        staticImpl.methodStatic;
        MyinterfaceStatic.methodStatic();
    }
}
