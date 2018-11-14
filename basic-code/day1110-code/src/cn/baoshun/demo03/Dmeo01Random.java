package cn.baoshun.demo03;

import java.util.Random;

/*
*Random类用来生成随机数字
* 1、导包
* import java.util.Random;
* 2、创建
* Random r = new Random()
* 3、使用
* 获取一个随机的int数字(是int所有范围，正负两种)
* int num = r.nextInt()
* 获取一个随机的int数字，参数代表了范围（左闭右开区间）
* int num = r.nextInt(3)    [0,3):也就是0-2
* */
public class Dmeo01Random {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数：" + num);
    }
}
