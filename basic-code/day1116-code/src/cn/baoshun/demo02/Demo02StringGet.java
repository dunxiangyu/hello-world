package cn.baoshun.demo02;

/*
* String 当中与获取相关的方法：
* public int length():获取字符串当中含有字符的个数，也就是字符串的长度
* public String concat(String str):将当前字符串和参数字符串拼接成为新的字符串，并返回新的字符串
* public char charAt(int index):获取自定位置的单个字符（索引从0开始）
* public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有就返回-1值
* */
public class Demo02StringGet {

    public static void main(String[] args) {
        // 获取字符串长度
        String str = "alksdfjjaljf";
        int length = str.length();
        System.out.println("字符串的长度：" + length);
        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);   // 原封不动
        System.out.println(str2);   // 原封不动
        System.out.println(str3);   // 新的字符串
        System.out.println("================");
        char ch = "Hello".charAt(1);
        System.out.println("1号的字符：" + ch);
        System.out.println("===========");
        // 查找参数字符串在字符串总的索引位置
        String str4 = "HelloWorld!";
        int index = str4.indexOf("llo");
        System.out.println("llo所在的索引：" + index);
        System.out.println("HelloWorld".indexOf("abc"));
    }
}
