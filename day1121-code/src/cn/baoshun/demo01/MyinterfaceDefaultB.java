package cn.baoshun.demo01;

public class MyinterfaceDefaultB implements MyinterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了接口方法bbb");
    }

    public void methodAbs2() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }

}
