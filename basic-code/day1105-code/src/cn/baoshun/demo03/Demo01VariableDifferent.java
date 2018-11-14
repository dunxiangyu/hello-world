package cn.baoshun.demo03;

/*
* 局部变量和成员变量
*
* 1、定义的位置不一样
* 局部变量：在方法的内部
* 成员变量：在方法的外部
*
* 2、作用范围不一样
* 局部变量：只有方法当中才可以使用
* 成员变量：整个类全都可以通用
*
* 3、默认值不一样
* 局部变量：没有默认值，如果想要使用，必须手动进行赋值
* 成员变量：如果没有赋值，会有默认值，规则和数组一样
*
* 4、内存的位置不一样
* 局部变量：位于栈内存
* 成员变量：位于堆内存
*
* 5、生命周期
* 局部变量：随着方法进栈而创建，随着方法弹栈而消失
* 成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失
* */
public class Demo01VariableDifferent {
    String name;

    public void methodA() {
        int num = 20;
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int pram) {     // 方法的参数是局部变量
        // 参数在方法调用的时候必然是会赋值的
        int age;
//        System.out.println(num);
//        System.out.println(age);  // 没有赋值不能使用
        System.out.println(pram);
        System.out.println(name);
    }
}
