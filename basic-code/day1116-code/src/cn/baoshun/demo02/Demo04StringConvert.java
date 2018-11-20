package cn.baoshun.demo02;

/*
* 字符串当中转换的方法有：
* public char[] toCharArray():将当前字符串拆分成为字符数组作为返回值
* Public byte[] getBytes():获得当前字符串底层的字节数组
* public String replace(CharSequence oldString, CharSequence newString):将所有出现的老字符串，替换成新的字符串，返回替换结果新的字符串
* 备注：CharSequences意思就是说可以接受字符串类型
*
* */
public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length); // 5
        System.out.println("=====================");

        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println("===========================");
        String str1 = "How do you do";
        String str2 = str1.replace("o", "#");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("===============================");
        String lang1 = "会不会玩儿呀？你大爷的！！！";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang1);
        System.out.println(lang2);

    }
}
