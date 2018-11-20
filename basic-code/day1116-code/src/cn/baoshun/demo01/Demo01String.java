package cn.baoshun.demo01;

/*
* java程序当中，所有的字符串字面值（如："abc"）都作为此类的实例实现
* 其实就是说，程序当中所有的""对象，都是String类对象，（就算没有new,也是String对象）
*
* 字符串是常量，他们的值在创建之后不能更改【重点】
* 正因为字符串不可更改，
* 字符串效果上，相当于char型数组，但是底层原理是byte字节数组
*
* 创建字符串的3+1种方式
* 三种构造方法：
* public String(){}     创建一个空白字符串，不含任何内容
* public String(char[] array){}   根据字符类容，创建一个字符串
* public String(byte[] array){}     根据字节数组的内容，创建一个字符串
* 一种直接创建：
* String = "adb";
* 注意：直接写上双引号就是对象
* */
public class Demo01String {

    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一个：" + str1);
        // 根据字符数组，创建字符串
        char[] array = new char[]{'a', 'b', 'c'};
        String str2 = new String(array);
        System.out.println("第二个：" + str2);
        // 根据字节数组创建
        byte[] bytes = new byte[] {96, 97, 98};
        String str3 = new String(bytes);
        System.out.println("第三个：" + str3);
        // 直接创建
        String str4 = "Hello, World";
        System.out.println("第四个：" + str4);
    }
}
