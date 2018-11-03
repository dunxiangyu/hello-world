package cn.baoshun.demo01;

/*
* 使用动态初始化数组的时候，其中元素将会拥有一个默认值，其中规则如下：
* 如果是整数类型：默认为0
* 如果是浮点型：0.0
* 如果是字符型：'\u0000'
* 如果是Boolean：false
* 如果是引用类型：null
*
* 注意事项：
* 静态初始化也有默认值，只不过系统马上将数组赋值了
* */

public class Demo05ArrayUse {

    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==================");
        arrayA[1] = 123;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

    }
}
