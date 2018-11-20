package cn.baoshun.demo02;

/*
* 定义一个方法将数组{1,2,3}按照指定格式拼接成一个字符串，格式参照[word1#word2#word3]
* */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] ints = new int[] {1, 2, 3};
        String str1 = method(ints);
        System.out.println(str1);
    }

    public static String method(int[] ints) {
        String str = "[";
        for (int i = 0; i < ints.length; i++) {
            if(i == ints.length - 1) {
                str += "world" + ints[i] + "]";
                break;
            }
            str += "world" + ints[i] + "#";
        }
        return str;
    }
}
