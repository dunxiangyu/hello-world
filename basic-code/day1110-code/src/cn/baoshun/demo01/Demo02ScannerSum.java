package cn.baoshun.demo01;

import java.util.Scanner;

/*
* 键盘输入两个数字求和
*
* */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("两个数字之和：" + sum);
    }
}
