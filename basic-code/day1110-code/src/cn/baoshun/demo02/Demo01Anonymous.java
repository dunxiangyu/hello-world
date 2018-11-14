package cn.baoshun.demo02;

/*
* 创建对象的标准格式：
* 类名称 对象名 = new 类名称();
*
* 匿名对象，就是只有右边的对象，没有左边的赋值运算符。
* new 类名称;
*
* 注意事项：
*   匿名对象只能使用唯一的一次，下次再用回再创建一个新的对象
* 使用建议：
*   如果确定一个对象，只需要使用唯一的一次，就可以使用
* */
public class Demo01Anonymous {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Jack";
        p.showName();
        System.out.println("========================");
        new Person().name = "Rose";
        new Person().showName();    // 我叫null
    }
}
