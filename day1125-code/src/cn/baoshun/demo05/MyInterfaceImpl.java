package cn.baoshun.demo05;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void method() {
        System.out.println("实现类覆盖重现了方法");
    }

    @Override
    public void method1() {
        System.out.println("方法2");
    }
}
