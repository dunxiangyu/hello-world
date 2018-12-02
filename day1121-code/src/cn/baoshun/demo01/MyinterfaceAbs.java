package cn.baoshun.demo01;

/*
* 任何版本的java中，接口可以定义抽象方法
*
* 基本格式：
* public abstract 返回值类型 方法名(参数列表);
*
* 注意：
* 1、接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
* 2、这两个关键字可以选择性的省略
* 3、方法的三要素可以随意进行定义
* */
public interface MyinterfaceAbs {

    // 这是一个抽象方法
    public abstract void methodAbs1();
    void methodAbs2();  // 这也是抽象方法

}

