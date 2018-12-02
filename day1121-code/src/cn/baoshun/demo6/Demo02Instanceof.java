package cn.baoshun.demo6;

/*
* 如何才能知道一个父类引用的对象，本来的子类是什么？
* 格式：
* 对象 instanceof 类名称
* 这将会得到一个boolean类型的结果，也就是判断前面的对象能不能当做后边类型的实例
* */
public class Demo02Instanceof {

    public static void main(String[] args) {
        Animal cat = new Cat(); // 本来是一只猫
        cat.eat();
        // 如果希望调用子类特有方法，需要向下转型
        cat = cat instanceof Cat ? ((Cat) cat) : null;
        
    }
}
