package cn.baoshun.demo03;

/*
* 如何获取数组的长度：
* 数组名称.length     :这将会得到一个int类型的数字，为数组的长度
*
* 数组一旦创建，在程序运行期间，长度不可改变
* */
public class Demo03ArrayLength {

    public static void main(String[] args) {

        int[] arrayA = new int[3];
        int[] arrayB = {20, 30, 14};
        int length = arrayB.length;
        System.out.println("数组的长度是" + length);
    }
}
