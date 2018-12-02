package cn.baoshun.demo6;

/*
* 向上转型是安全的，没问题的，正确的，但是也有一个弊端
* 对象一旦向上转型为父类，就无法调用子类原本特有的方法了
*
* 解决方法：
* 用对象的向下转型还原
* */
public class Demo01Main {

    public static void main(String[] args) {
        // 向上转型就是父类引用指向子类对象
        Animal cat = new Cat();
        cat.eat();
//        cat.catchMouse();
        ((Cat) cat).catchMouse();
    }
}
