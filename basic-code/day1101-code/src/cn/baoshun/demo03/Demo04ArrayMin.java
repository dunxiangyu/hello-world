package cn.baoshun.demo03;

public class Demo04ArrayMin {
    public static void main(String[] args) {
        int[] arrayA = new int[]{15, 20, 40, 30, 10000};
        int min = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            if (arrayA[i] < min) {
                min = arrayA[i];
            }
        }
        System.out.println("最小值：" + min);
    }
}
