package cn.baoshun.demo02;

/*
* 字符串的分割方法：
* public String[] split(String regex):按照参数规则，将字符串分割成若干部分
* 注意：
* split方法的参数其实是一个正则表达式，
* 如果按照英文句点".",必须写两个反斜杠"\\."
* */
public class Dmeo05StringSplit {

    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] strings = str1.split(",");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("==============");
        String str2 = "aaa bbb ccc";
        String[] strings1 = str2.split(" ");
        for (int i = 0; i < strings1.length; i++) {
            System.out.println(strings1[i]);
        }
        System.out.println("----------------------");
        String str3 = "aaa.bbb.ccc";
        String[] strings2 = str3.split("\\.");
        for (int i = 0; i < strings2.length; i++) {
            System.out.println(strings2[i]);
        }
    }
}
