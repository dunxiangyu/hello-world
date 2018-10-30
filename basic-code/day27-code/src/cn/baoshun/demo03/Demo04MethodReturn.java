package cn.baoshun.demo03;

/*
* 注意事项：
* 1、对于有返回值，可以使用单独或者打印调用
* 1、对于无返回值的方法，只能单独调用，不能打印调用
* */
public class Demo04MethodReturn {

    public static void main(String[] args) {
        // 有返回值
        int num = getSum(10, 20);
        System.out.println("返回值：" + num);
        System.out.println("=====================");
        // 无返回值
        printSum(100, 200);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static void printSum(int a, int b){
        int result = a + b;
        System.out.println("结果是：" + result);
    }
}
