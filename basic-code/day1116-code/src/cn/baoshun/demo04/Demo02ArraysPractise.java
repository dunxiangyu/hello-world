package cn.baoshun.demo04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
* 将一个随机字符串，进行升序排列，并降序打印
* */
public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "asjfdlajflafjlakjlakj12eafjal";
        // 将字符串变成数组
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
