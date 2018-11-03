package cn.baoshun.demo03;

public class Demo01ArrayIndex {

    public static void main(String[] args) {

        int[] arrayA = new int[]{15, 25, 35};
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
//        System.out.println(arrayA[3]);    错误写法，并不存在3号元素，所以出现了越界异常ArrayIndexOutOfBoundsException
    }
}
