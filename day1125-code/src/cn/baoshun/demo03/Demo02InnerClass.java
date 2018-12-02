package cn.baoshun.demo03;

public class Demo02InnerClass {

    public static void main(String[] args) {

        // 外部类名称.内部类名称 变量名称 = new 外部类名称().new 内部类名称();
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
