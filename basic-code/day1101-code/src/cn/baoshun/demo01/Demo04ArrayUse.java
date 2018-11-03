package cn.baoshun.demo01;

/*
* 直接打印数组名称，得到的是数组对应的内存地址值
*
* 访问数组元素的格式：
* 索引值：就是一个int数字，代表数组当中的排序编号
* 【注意】：索引值从0开始
* */

public class Demo04ArrayUse {

    public static void main(String[] args) {
        // 省略格式
        int[] arrayA = {10, 20, 30};
        System.out.println(arrayA); // [I@1540e19d: [代表数组格式，I代表int类型， 1540e19d内存地址值
        // 直接打印数组中的元素内容
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("======================");
        // 将数组中的元素赋值给变量
        int num = arrayA[1];
        System.out.println(num);
    }
}
