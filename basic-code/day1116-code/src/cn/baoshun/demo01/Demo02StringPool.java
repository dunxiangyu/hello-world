package cn.baoshun.demo01;

/*
* 字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中
*
* 对于基本类型来说，== 是对于数值的比较
* 但是对于引用类型来说， == 是对于地址值的比较
* */
public class Demo02StringPool {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] chars = new char[]{'a', 'b', 'c'};
        String str3 = new String(chars);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str2);
    }



}
