package cn.baoshun.demo01;

import java.util.Arrays;

/*
* 面向对象：不关心具体的动作
* */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 40, 60};
        // 使用面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){     // 如果是最后一个元素
                System.out.println(array[i] + "]");
            } else {        // 如果不是最后一个元素
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("===========================================");
        // 找一个JDK给我们提供好的Arrays这个类，直接实现数组的打印
        System.out.println(Arrays.toString(array));
    }
}
