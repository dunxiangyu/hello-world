package cn.baoshun.demo01;

/*
* 从java9开始，接口当中允许定义私有方法
* 普通私有方法：解决多个默认方法之间代码重复问题
* 格式：
* private 返回值类型 方法名称(参数列表){
*   方法体
* }
* 静态私有方法发：解决多个静态方法之间代码重复问题
* private static 返回值类型 方法名称（参数列表） {
*
* }
* */
public interface MyinterfacePrivateA {

    public default void methodDefault1() {
        System.out.println("这是一个默认方法1");
//        methodCommon();
    }

    public default void methodDefault2() {
        System.out.println("这是一个默认方法2");
//        methodCommon();
    }

}
