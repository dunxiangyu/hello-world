package cn.baoshun.demo02;

/*
* == 是对字符串地址值的比较，如果确实需要字符串内容比较可以使用两个方法
* public boolean equals(Object object){}    参数可以是任何对象，只有参数是一个字符串，并且内容相同才会给true，否则返回值是一个false
* 备注：任何对象都可以用object进行接收
* equals方法具有对称性，也就是a.equals(b)和b.equals(a)的效果是一样的
* 如果比较双方一个常量一个变量，那么推荐把常量写到前面
* 推荐："abc".equals(str)， 不推荐：str.equals("abc")
*
* public boolean equalsIgnoreCase(String str){} :忽略大小写进行内容比较
* */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] chars = new char[]{'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));
        System.out.println("==============");

        String str = null;
        System.out.println("abc".equals(str));  // 推荐
//        System.out.println(str.equals("abc"));  // 不推荐

        System.out.println("==========");
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));
    }
}
