package cn.baoshun.demo03;

public class Demo04Array {

    public static void main(String[] args) {

        int[] arrayA = new int[]{20, 25, 30, 40};
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println(arrayA[3]);
        System.out.println("==========================");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }
}
