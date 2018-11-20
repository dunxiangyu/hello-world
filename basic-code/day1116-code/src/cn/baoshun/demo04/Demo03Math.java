package cn.baoshun.demo04;

/*
* java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学相关的操作
*
* public static double abs(double num): 获取绝对值
* public static double ceil(double num): 向上取整
* public static double floor(double num): 向下取整
* public static long round(double num): 四舍五入
*
* Math.PI: 近似的圆周率常量
* */
public class Demo03Math {
    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(-98));
        System.out.println(Math.abs(0));
        // 向上取整
        System.out.println(Math.ceil(2.13));
        System.out.println(Math.ceil(-2.13));
        // 向下取整
        System.out.println(Math.floor(2.13));
        System.out.println(Math.floor(-2.13));
        // 四舍五入
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.6));
        System.out.println(Math.round(-3.6));
        System.out.println(Math.round(-3.5));
    }
}
