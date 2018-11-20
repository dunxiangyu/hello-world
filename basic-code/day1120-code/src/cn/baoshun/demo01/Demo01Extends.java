package cn.baoshun.demo01;

/*
* 在继承的关系中，子类就是一个父类，也就是说，子类可以被当做父类看待
* 例如子类是讲师，父类是员工，那么讲师就是一个员工，这样的关系：is-a
* 格式：
* 定义父类格式：
* public class 父类名称{
*   // ......
*
* }
*
* 定义子类的格式：
* public class 子类名称 extends 父类名称{
*   // ........
*
* }
* */
public class Demo01Extends {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        // Teacher类中虽然什么都没有写，但是继承了来自父类的method方法
        teacher.method();
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
