package cn.baoshun.demo02;

/*
 * 定义方法的格式：
 * 修饰符 返回值类型 方法名称（参数类型 参数名称，....）{
 *   方法体；
 *   return 返回值;
 * }
 * 方法的三种调用：
 * 1、单独调用
 * 2、打印调用
 * 3、赋值调用
 * */

public class Demo02MethodDefine {
    public static void main(String[] args) {
        // 单独调用
        sum(10, 20);
        System.out.println("==============");
        // 打印调用
        System.out.println(sum(10, 20));
        System.out.println("==============");
        // 赋值调用
        int num = sum(15, 25);
        System.out.println(num);

    }

    public static int sum(int a, int b) {
        int result = a + b;
        System.out.println("方法执行了");
        return result;
    }
}
