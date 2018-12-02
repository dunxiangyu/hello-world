package cn.baoshun.demo01;

/*
* final关键字：最终，不可改变的
* 1、用来修饰类
* 2、用来修饰方法
* 3、用来修饰局部变量
* 4、用来修饰成员变量
* */
public class Demo02Final {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);

        /*
        * 一旦使用final用来修饰局部变量，那么这个变量就不能进行修改
        * 一次赋值，终生不变
        * */
        final int num2 = 200;
        System.out.println(num2);
//        num2 = 250;
//        num2 = 200;

        // 正确写法，只要保证有唯一一次赋值即可
        final int num3;
        num3 = 30;
        System.out.println("==============");
        /*
        * 对于基本类型来说，不可变说的是变量当中的数据不可改变
        * 对于引用类型来说，不可变说的是变量当中的地址值不可改变
        * */
        Student stu1 = new Student("Jack");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        stu1 = new Student("Rose");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        System.out.println("================");

        final Student stu2 = new Student("Ben");
        System.out.println(stu2.getName());
        System.out.println(stu2);
//        stu2 = new Student("James");
        stu2.setName("JJJ");
        System.out.println(stu2.getName());
        System.out.println(stu2);
    }
}
