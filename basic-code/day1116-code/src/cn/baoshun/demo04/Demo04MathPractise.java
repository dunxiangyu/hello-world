package cn.baoshun.demo04;

/*
* 计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
*
* 1、既然确定了范围，就用for循环
* 2、-10.8转换成成-10：向上取整
* 3、                强制类型转换也可以
* */
public class Demo04MathPractise {

    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int)Math.ceil(min); i <= Math.ceil(max); i++) {   // 变量i是区间的所有整数
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("个数：" + count);
    }
}
