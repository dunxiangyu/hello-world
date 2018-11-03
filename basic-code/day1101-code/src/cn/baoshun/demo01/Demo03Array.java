package cn.baoshun.demo01;

/*
 * 使用静态初始化数组时，还可以省略格式
 * 数据类型[] 变量名称 = {元素1， 元素2，......};
 *
 * 注意事项：
 * 1、静态初始化没有直接指定长度，但是仍然会自动推算到长度
 * 2、静态初始化标准格式可以拆分成两个步骤
 * 3、动态初始化也可以拆分成两个步骤
 * 4、静态初始化的省略格式，不能拆分成为两个步骤
 *
 * 使用建议：
 * 如果不确定数组当中的具体内容，用动态初始化，否则一经确定了数组中的内容用静态初始化
 * */

public class Demo03Array {
    public static void main(String[] args) {
        int[] arrayA = {3, 5, 35};
        // 拆分两步
        int[] arrayB;
        arrayB = new int[]{1, 2, 12};
        int[] arrayC;
        arrayC = new int[3];
    }
}
