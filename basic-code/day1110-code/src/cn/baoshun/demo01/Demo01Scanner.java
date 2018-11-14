package cn.baoshun.demo01;

import java.util.Scanner;

public class Demo01Scanner {

    public static void main(String[] args) {
        // 创建
        Scanner scanner = new Scanner(System.in);   // System.in代表从键盘输入
        int num = scanner.nextInt();
        System.out.println("输入的数字是：" + num);
        String str = scanner.next();
        System.out.println("输入的字符串：" + str);
    }



}
