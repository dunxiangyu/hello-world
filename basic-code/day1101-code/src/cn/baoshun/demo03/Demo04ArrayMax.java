package cn.baoshun.demo03;

public class Demo04ArrayMax {
    public static void main(String[] args) {
        int[] arrayA = new int[]{15, 20, 40, 30, 10000};
        int max = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            if (arrayA[i] > max) {
                max = arrayA[i];
            }
        }
        System.out.println("最大值：" + max);
    }
}
