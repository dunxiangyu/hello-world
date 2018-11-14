package cn.baoshun.demo02;

import java.util.Scanner;

public class Demo02Anonymous {

    public static void main(String[] args) {
        // 使用普通方法创建
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        // 匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);
        // 使用匿名对象进行传参
//        method(new Scanner(System.in));
        // 匿名对象作为返回值
        Scanner sc = method2();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void method(Scanner sc) {

        int num = sc.nextInt();
        System.out.println("输入的是：" + num);

    }

    public static Scanner method2() {

        return new Scanner(System.in);
    }
}
