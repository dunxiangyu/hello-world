package cn.baoshun.demo01;

/*
 * 静态初始化数组（指定内容）：在创建的时候，不直接指定元素个数，而是直接将指定内容进行指定
 *
 * 静态初始化基本格式：
 * 数据类型[] 变量名称 = new 数据类型[] {元素1, 元素2, ....};
 * */

public class Demo02Array {

    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 2, 12, 40};
        String[] arrayB = new String[]{"hello", "world", "Java"};
    }
}
