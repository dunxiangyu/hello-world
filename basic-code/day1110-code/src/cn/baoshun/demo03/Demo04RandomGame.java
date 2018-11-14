package cn.baoshun.demo03;

import java.util.Random;
import java.util.Scanner;

/*
* 1、首先需要产生一个随机数字，一旦产生，不能发生变化，用Random的nextInt()方法
* 2、键盘输入，用到了Scanner类，用nextInt()方法
* 4、已经得到了两个数字，随机数和键盘输入，判断有没有猜对  if
*   三种情况：太大     重试
*           太小      重试
*           猜中      结束
* 5、重试就是再来一遍循环次数不确定，用while(true)
* */
public class Demo04RandomGame {

    public static void main(String[] args) {

        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;    // 1-100

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("请输入你的猜测：");
            int guessNum = sc.nextInt();

            if(randomNum < guessNum) {
                System.out.println("太大了");
            } else if(randomNum > guessNum) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜你，猜中了！！！");
                break;
            }
        }
        System.out.println("游戏结束！");


    }
}
