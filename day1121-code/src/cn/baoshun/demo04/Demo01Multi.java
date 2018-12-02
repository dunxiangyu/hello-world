package cn.baoshun.demo04;


/*
* 代码当中体现多态性，父类引用只想子类对象
* 格式：
* 父类名称 对象名称 = new 子类名称();
* 或者：
* 接口名称 对象名称 = new 实现类名称();
* */
public class Demo01Multi {
    public static void main(String[] args) {
        // 多态的写法
        // 左侧父类引用指向了有侧子类的对象
        Fu obj = new Zi();

        obj.mehtod();
        obj.methodFu();
    }
}
