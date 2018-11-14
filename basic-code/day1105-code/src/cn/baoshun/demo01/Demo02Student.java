package cn.baoshun.demo01;

/*
* 通常情况下一个类不能直接使用，需要根据一个类创建一个对象，才能使用
* 1、导包：支出需要使用的类在什么位置
*   import 包名称.类名称;
*   对于和当前类属于同一个包的情况，可以省略导包语句不写
* 2、创建
*   类名称 对象名 = new 类名称();
* 3、使用 :分为两种情况
*   使用成员变量：对象名.成员变量
*   使用成员方法：对象名.成员方法名(参数);
*
* 注意事项：
* 如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样
* */
public class Demo02Student {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println("=====================");
        // 方便对象成员变量当中的数值
        student.name = "张三";
        student.age = 18;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println("================================");
        // 使用对象的成员方法
        student.eat();
        student.sleep();
        student.study();
    }
}
