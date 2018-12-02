package cn.baoshun.demo05;

/*
* 方法的覆盖重写注意事项：
*   1、必须保证方法的名称相同，参数列表也相同
*   2、子类方法的返回值，必须小于等于父类返回值
*   3、子类方法的权限必须大于等于父类方法的权限修饰符
*       public > protected >（default）> private      (default不是关键字，而是什么都不写)
* @override:写在方法前面，用来检测是不是有效的覆盖重写
* 这个注解就算不写，只要满足要求，这个方法就是覆盖重写
*
* */
public class Demo01override {
}
