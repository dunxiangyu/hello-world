package cn.baoshun.demo01;

/*
* 数组：是一种容器，可以同时存放多个数据
* 特点：
* 1、数组是一种引用类型
* 2、数组中的数据类型必须统一
* 3、数组长度在程序运行期间不可更改
*
* 数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值
* 两种常见的初始化方式：
* 1、动态初始化（直接指定数组的长度）
* 2、静态初始化（指定内容）
*
* 动态初始化数组格式：
* 数据类型[] 变量名 = new 数据类型[数组长度];
*
* */

public class Demo01Array {
    public static void main(String[] args) {

        // 创建一个数组，可以存放300个int数据
        int[] arrayA = new int[300];
        // 创建一个数组，存放10个double类型数组
        double[] arrayB = new double[10];
        // 创建一个数组，存放5个字符串类型数组
        String[] arrayC = new String[5];

    }
}
