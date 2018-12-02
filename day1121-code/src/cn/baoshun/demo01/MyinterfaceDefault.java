package cn.baoshun.demo01;

/*
* 重java8，接口里允许定义默认方法
* 格式：
* public default 返回值类型 方法名称（参数列表） {
*   // ...........
* }
*
* 备注：接口当中的默认方法，可以解决升级的问题
*
* */
public interface MyinterfaceDefault {

    public abstract void methodAbs();
//    public abstract void methodAbs2();
    // 新添加的方法改成默认方法
    public default void methodAbs2() {
        System.out.println("这是新添加的默认方法！！！");
    }

}

