package cn.baoshun.demo02;

/*
 * 有参数：将数据告诉方法
 * 无参数：不需要任何数据，独立完成任务
 * */

public class Demo03MethodParam {
    public static void main(String[] args) {

        method1(1, 20);
        System.out.println("===============");
        method2();
    }

    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是：" + result);
    }

    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World!" + i);
        }
    }
}
