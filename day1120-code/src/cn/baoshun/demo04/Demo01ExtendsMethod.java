package cn.baoshun.demo04;

/*
* 在父子类的继承关系当中，创建子类对象，访问成员方法规则：
*      创建的对象是谁，就优先用谁，如果没有则向上找
*
* 注意事项：
*   无论是成员方法还是成员变量，如果没有则向上找父类
*
* 重写（override）：
* 概念：在继承关系中，方法的名称一样，参数列表也一样
* 重写（override）：发生在继承中，方法的名称一样，方法的参数列表不一样    【覆盖、覆写】
* 重载（overload）: 方法的名称一样，方法的参数列表不一样
*
* 特点：创建的是子类对象，则优先用子类对象方法
* */
public class Demo01ExtendsMethod {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();
        zi.method();
    }
}
