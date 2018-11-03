package cn.baoshun.demo02;

public class Demo01ArrayOne {

    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("================");
        // 改变数组中元素的内容
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
    }
}
