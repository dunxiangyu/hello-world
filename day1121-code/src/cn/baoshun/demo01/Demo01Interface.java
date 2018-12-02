package cn.baoshun.demo01;

/*
* 接口就是多个类的公共规范
* 接口是一种引用数据类型，最重要的内容就是：抽象方法
* 如何定义一个接口的格式：
* public interface 接口名称 {
*   // 接口内容
* }
*
* 备注：
* .java-->.class
* 换成了关键字interface之后，编译生成的 .java-->.class
*
* 如果是java7，接口中包含的内容 ：
* 1、常量
* 2、抽象方法
* 如果是java8，还可以额外包含：
* 3、默认方法
* 4、静态方法
* 如果是java9，还可以额外包含：
* 5、私有方法
*
* 接口使用步骤：
* 1、接口不能直接使用，必须有一个实现类来实现接口
* 格式：
* public class 实现类名称 implements 接口名称 {
*   // .....
* }
* 2、接口的实现类必须覆盖重写，接口中的所有抽象方法
*
* 3、创建实现类的对象进行使用
*
* 注意事项：
* 如果实现类并没有重写或者覆盖接口中的抽象方法，那这个实现类必须是抽象类
*
*
* */
public class Demo01Interface {

    public static void main(String[] args) {
        MyInterfaceAbstractImpl myInterfaceImpl  = new MyInterfaceAbstractImpl();
        myInterfaceImpl.methodAbs1();
        myInterfaceImpl.methodAbs2();
    }
}
