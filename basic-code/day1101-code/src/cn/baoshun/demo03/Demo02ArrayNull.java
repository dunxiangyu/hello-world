package cn.baoshun.demo03;

/*
* 所有的引用类型都可以赋值为null值，但是代表其中什么都没有
* */
public class Demo02ArrayNull {

    public static void main(String[] args) {

        int[] arrayA = null;
        System.out.println(arrayA[0]);  // NullPointerException 空指针异常
    }
}
