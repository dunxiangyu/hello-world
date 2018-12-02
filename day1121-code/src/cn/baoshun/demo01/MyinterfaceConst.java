package cn.baoshun.demo01;

/*
* 接口当中也可以定义成员变量，但是必须使用public static final这三个关键字
* 从效果上看，这其实就是接口的常量
* 格式：
* public static final 数据类型 变量名称 = 数据值;
* 备注：
* 一旦使用final关键字进行修饰，说明不可改变
*
* 注意事项：
* 1、接口当中的常量可以省略public static final  注意：不写也照样是这样
* 2、接口当中的常量必须进行赋值，不能不赋值
* */
public interface MyinterfaceConst {

    public static final int NUM = 10;   // 这其实就是一个常量，一旦赋值，不可以修改



}
