package cn.baoshun.demo11;

/*
* 抽象方法：就是加上abstract关键字，去掉大括号，直接分号结束
* 抽象类：抽象方法所在的类，必须是抽象类才行，在class之前写上abstract
*
* 如何使用抽象类和抽象方法：
* 1、不能直接new创建抽象类对象
* 2、必须使用一个子类来继承抽象类
* 3、子类必须覆盖重写父类中的抽象方法
* 覆盖重写（实现）：子类去掉抽象的abstract关键字，然后补上方法体大括号
* 4、创建子类对象，进行使用
* */
public abstract class Animal {

    // 抽象方法
    public abstract void eat();

    public void normalMethod() {
        System.out.println("这是一个普通的方法！！！");
    }
}
