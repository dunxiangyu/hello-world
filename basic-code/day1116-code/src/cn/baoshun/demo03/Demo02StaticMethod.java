package cn.baoshun.demo03;

/*
* 一旦使用static修饰成员方法，那么这就成了静态方法
* 静态方法不属于对象，而是属于类的
*
* 如果没有static关键字，必须首先创建对象，使用对象引用它
* 如果有了static关键字，直接通过类名称.方法名来进行调用
*
* 注意事项：
* 1、静态只能直接访问静态，不能直接访问非静态
* 2、静态方法当中不能用this
* */
public class Demo02StaticMethod {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method();

        // 对于静态方法来说，可以对象名调用，也可以通过类名称来调用
        myClass.staticMethod();     // 这种写法在编译以后，会自动翻译为类名称.静态方法
        MyClass.staticMethod();

        // 对于本类当中的静态方法，类名称可以省略
        myMethod();
    }

    public static void myMethod() {
        System.out.println("自己的方法");
    }
}
