package cn.baoshun.demo04;

/*
* 判断两个数是否相等
* */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {

    }

    public static boolean isSame(byte a, byte b) {
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        return a == b;
    }

    public static boolean isSame(int a, int b) {
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        return a == b;
    }

}
