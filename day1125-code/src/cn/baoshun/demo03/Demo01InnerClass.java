package cn.baoshun.demo03;

/*
* 如果一个事物内部包含另一个事物，那么这就是一个类内部包含另一个类
* 例如：身体和心脏的关系、汽车和发动机的关系
*
* 分类：
* 1、成员内部类
* 2、局部内部类（包含匿名内部类）
*
* 成员内部类的定义：
* 修饰符 class 外部类名称{
*   修饰符 class 内部类名称{
*
*   }
* }
*
* 注意：
* 内用外：可以随意访问
* 外用内：一定需要借助内部类对象
*
*==========================================
*
* 如何使用成员内部类
* 1、在外部类的方法当中使用内部类，main使用外部类的方法，这是间接使用
* 2、直接使用方式，格式：
* 类名称 对象名 = new 类名称();
* 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
* */
public class Demo01InnerClass {

    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        System.out.println("=============");

        // 按照格式来：
        Body.Heart heart = new Body().new Heart();
        heart.methodHeart();
    }
}
