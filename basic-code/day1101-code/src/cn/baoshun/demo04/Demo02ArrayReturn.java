package cn.baoshun.demo04;

/*
 * 一个方法可以0、1、多个参数，但只能有0或1个返回值，不能有多个返回值
 * 如果希望一个方法当中产生了多个结果进行返回
 * 任何数据类型都可以作为方法的参数类型和返回值类型
 *
 * 数组作为方法的返回值类型，其实返回的也是数组的地址值
 * */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] array = calculate(10, 20, 30);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        // 连个记过都希望进行返回
        int[] array = new int[]{sum, avg};
        return array;
    }
}
