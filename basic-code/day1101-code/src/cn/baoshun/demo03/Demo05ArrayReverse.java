package cn.baoshun.demo03;

/*
* 数组反转：{1,2,3,4}
* 原来：{1,2,3,4}
* 结果：{4,3,2,1}
*
* 要求：
* 不能使用新数组，只可以用本数组
* */
public class Demo05ArrayReverse {

    public static void main(String[] args) {
        int[] arrayA = new int[]{10, 15, 6, 100, 200};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + ",");
        }
        System.out.println();
        System.out.println("===========================");
        for (int i = 0; i < arrayA.length/2; i++) {

            int temp = arrayA[i];
            arrayA[i] = arrayA[arrayA.length-1-i];
            arrayA[arrayA.length-1-i] = temp;

        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + ",");
        }
    }
}
