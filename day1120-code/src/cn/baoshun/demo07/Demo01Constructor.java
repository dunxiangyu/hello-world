package cn.baoshun.demo07;

/*
* 继承关系中，父子类构造方法的访问特点
*
* 1、子类构造放发当中，有一个默认隐含的super()调用，所以一定是先调用的父类够着，后执行的子类构造
* 2、可以通过super()关键字来调用父类，重载构造
* 3、super的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次父类构造
*
* */
public class Demo01Constructor {

    public static void main(String[] args) {
        Zi zi = new Zi();
    }

    public void method() {
//        super();    // 只有子类的构造方法才能调用父类的构造方法
    }

}
