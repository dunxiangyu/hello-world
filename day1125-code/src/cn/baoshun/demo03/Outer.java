package cn.baoshun.demo03;

/*
* 如果出现了重名现象，格式是：
* 外部类名称.this.外部类变量名称
* */
public class Outer {

    int num = 10;

    public class Inner {
        int num = 20;

        public void methodInner() {
            System.out.println("内部类的变量" + num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
