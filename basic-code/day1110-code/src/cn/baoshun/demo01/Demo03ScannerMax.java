package cn.baoshun.demo01;

import java.util.Scanner;

/*
* 键盘输入三个数，输出其中 最大值
* */
public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("输入第三个数字：");
        int c = sc.nextInt();
        int d = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println("最大值：" + d);
    }
}
