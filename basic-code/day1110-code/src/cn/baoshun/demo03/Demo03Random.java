package cn.baoshun.demo03;

import java.util.Random;

/*
* 根据一个变量n的值，获取随机数字1-n的值[1,n]
* 1、定义一个变量n
* 2、要使用Random
* 3、如果是10，那么就是0-9
*   然而想要的是1-10
*   可以发现整体加1即可
*  4、打印随机数字
* */
public class Demo03Random {

    public static void main(String[] args) {
        int n = 10;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(n) + 1;     // 0-9-->1-10
            System.out.println(num);
        }

    }
}
