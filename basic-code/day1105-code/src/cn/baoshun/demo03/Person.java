package cn.baoshun.demo03;

/*
* 问题：定义年龄时，无法阻止不合理的数字被设置进来
* 解决：使用private关键字将需要保护的成员变量进行修饰
*
* 一旦使用了private进行修饰，那么本类当中仍然可以随意访问
* 但是！超出了本类范围之外就不能再直接访问了。
* */
public class Person {

    String name;
    private int age;

    public void show() {
        System.out.println("我叫：" + name + ",年龄：" + age);
    }
    // 这个成员方法专门用于向age设置数据
    public void setAge(int age){
        if(age < 100 & age > 0){
            this.age = age;
        } else {
            System.out.println("数据不合理!!!");
        }
    }
    // 这个成员方法专门用于获取私有变量的数据
    public int getAge() {
        return this.age;
    }
}
