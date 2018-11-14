package cn.baoshun.demo04;

/*
* 当方法的局部变量和类的成员变量重名的时候，就近原则，使用局部变量
* 如果要使用成员变量，需要使用格式：
* this.成员变量
*
* 通过谁调用的方法，谁就是this
* */
public class Person {
    String name;

    public void sayHello(String name) {
        System.out.println(name + "你好, 我是：" + this.name);
        System.out.println(this);
    }
}
