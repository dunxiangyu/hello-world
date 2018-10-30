package cn.baoshun.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20));
        System.out.println(isSame(10, 10));
    }

    public static Boolean isSame(int a, int b) {
/*        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        */
       /* boolean same = (a == b);
        return same;*/
        return a == b;
    }
}
