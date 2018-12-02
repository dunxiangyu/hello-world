package cn.baoshun.demo02;

/*
* 这个子接口中有几个方法呢？
* methodA()
* methodB()
* methodCommon()
* method()
* */
public interface MyInterface {

    public default void method() {
        System.out.println("接口的默认方法");
    }

}
