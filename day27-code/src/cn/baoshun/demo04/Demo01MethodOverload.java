package cn.baoshun.demo04;

/*
* 方法的重载：Overload
* 多个方法的名称一样，参数列表不一样
* 好处：只需要记住一个方法名称，就可以实现类似的功能
* 方法重载与下列因素有关：
* 1、参数个数不同
* 2、参数类型不同
* 3、参数的多类型顺序不同
* */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }

    public static int sum(int a, int b){
        System.out.println("有两个参数");
        return a + b;
    }

    public static int sum(int a, int b, int c){
        System.out.println("有三个参数");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        System.out.println("有四个参数");
        return a + b + c +d;
    }
}
