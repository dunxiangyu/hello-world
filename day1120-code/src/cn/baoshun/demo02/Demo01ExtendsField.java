package cn.baoshun.demo02;

/*
* 在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：
* 1、直接：直接通过子类对象访问对象
*       等号左边是谁，就优先用谁，没有则向上找
* 2、间接：通过成员方法访问成员变量
*       方法属于谁，就优先用谁，没有则向上查找
* */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("=================");
        System.out.println(zi.num); // 优先子类
        System.out.println(fu.num); // 父类优先
        System.out.println("=====================");

        zi.methodZi();  // 这个方法是子类的，优先用子类的，如果没有，向上查找父类
        zi.methodFu();  // 这个方法是父类的，优先用父类的

    }
}
