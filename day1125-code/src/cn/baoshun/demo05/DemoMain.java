package cn.baoshun.demo05;

/*
* 如果接口的实现类，或者是父类的子类只需要实现一次，
* 那么这种情况下，就可以省略到该类的定义，改为使用匿名内部类
* 匿名内部类的定义格式：
* 接口名称 对象名 = new 接口名称(){
*   // 覆盖重写抽象方法
* };
*
* 对格式进行解析：
* new 接口名称（） {......}
* 1、new 代表创建对象的动作
* 2、接口名称就是匿名内部类需要实现哪个接口
* 3、{...}匿名内部类的内容
*
* 注意
* 1、匿名内部类在创建对象的时候只能使用唯一一次
* 如果希望多次创建对象，而且使用的内容一样的话，那么就必须使用单独定义的实现类了。
* 2、匿名对象是调用方法的时候，只能调用唯一一次，
* 如果希望同一个对象，调用多次方法，必须给对象取个名字。
* 3、匿名内部类是省略了实现类或者是子类，但是匿名对象是省略了对象名称，
* 强调：
*   匿名内部类和匿名对象不是一回事儿！！！
* */
public class DemoMain {

    public static void main(String[] args) {

        MyInterface impl = new MyInterfaceImpl();
        impl.method();

        System.out.println("===============");

        // 使用匿名内部类
        MyInterface inte = new MyInterface() {

            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }

            @Override
            public void method1() {
                System.out.println("实现方法2");
            }
        };
        inte.method();
        inte.method1();

    }
}
