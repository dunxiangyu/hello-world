package cn.baoshun.demo02;

import java.util.Scanner;

/*
* 键盘输入一个字符串，统计其中各种字符出现的次数，大写字母，小写字母，数字，其他
* */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String str = scanner.next();    // 获取键盘输入的字符串
        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if('A' <= ch && ch <= 'Z'){
                countUpper ++;
            } else if('a' <= ch && ch <= 'z'){
                countLower ++;
            } else if('0' <= ch && ch <= '9'){
                countNum ++;
            } else {
                countOther ++;
            }
        }
        System.out.println("大写字母有：" + countUpper + "个");
        System.out.println("小写字母有：" + countLower + "个");
        System.out.println("数字有：" + countNum + "个");
        System.out.println("其他字符有：" + countOther + "个");
    }
}
