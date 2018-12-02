package cn.baoshun.demo01;

/*
* 对于成员变量来说，如果使用final关键字进行修饰，那么这个关键字也照样不可变
*
* 1、由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了
* 2、对于final的成员变量，要么使用直接赋值，要么使用成员变量赋值，二者选其一
* 3、必须保证类当中所有重载方法，都会最终对final的成员变量重新赋值
* */
public class Person {

    private  String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
