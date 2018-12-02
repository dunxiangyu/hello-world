package cn.baoshun.demo01;

/*
* 当final关键字用来修饰一个类的时候，
* 格式：
* public final class 类名称 {
*   // ...
* }
*
* 含义：当前这个类，不能有任何的子类。（太监类）
*
* 一个类，如果是final类，那么其中所有的成员方法，都不能进行覆盖重写
* */
public  final class MyClass {
    public void method() {
        System.out.println("方法执行！！！");
    }
}
