package cn.baoshun.demo04;

import java.util.ArrayList;

/*
* 数组长度不可以发生改变
* 但是ArrayList数组长度是可以随时改变的
*
* 对于ArrayList来说，有一个<E>代表泛型
* 泛型：也就是装在集合中的所有元素，全都是统一的什么类型
* 注意：泛型只能是引用类型，不能是基本类型
*
* 扩展：
*   对于ArrayList集合来说，直接打印，得到的是内容，如果没有内容，得到的是空的[]
* */
public class Demo02ArrayList {

    public static void main(String[] args) {
        // 创建了一个ArrayList的集合，集合的所有元素类型是String
        // 备注：从JDK1.7开始，右侧尖括号内部可以不写内容，但是<>本身还是要写的
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);

        // 想集合中添加数据需要用到add()方法
        arrayList.add("Jack");
        arrayList.add("Rose");
        arrayList.add("Ben");
        System.out.println(arrayList);
    }
}
