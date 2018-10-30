package cn.baoshun.demo03;

/*
* 方法应该定义在类中，不能在方法中定义方法，不能嵌套
* 方法定义的前后顺序无所谓
* 方法有返回值必须写上return
* return的返回值类型必须和方法的返回值类型一致
* 对于void没有返回值的方法，不能写return返回值
*
* */

public class Demo04MethodNotice {

    public static int method1(){
        return 10;
    }

    public static void method2(){
        return; // 没有返回值，只是方法结束时执行而已
    }

    public static void method3(){
        System.out.println("AAA");
        System.out.println("BBB");
        return; // 最后一行的return可以省略
    }

    public static int getMax(int a, int b){
        return a > b ? a : b;
    }
}
