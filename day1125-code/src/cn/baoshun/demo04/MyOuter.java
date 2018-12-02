package cn.baoshun.demo04;

/*
* 局部内部类，如果希望访问所在方法的局部变量，那么这个变量必须是有效final的
*
* 备注：
* 从java8+开始，只要局部变量事实不变，那么final关键字可以省略
*
* 原因：
* new出来的对象在堆内存当中，
* 局部变量跟方法走的在栈内存当中
* 方法运行完了以后，立刻出栈，局部变量会立刻消失
* new出来的对象在堆中存在，直到垃圾回收
* */
public class MyOuter {

    public void methodOuter() {

        int num = 10;   // 所在方法的局部变量

        class MyInner {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
