package cn.baoshun.demo04;

/*
* 构造方法是专门用来创建对象的方法，当我们通过new来创建对象时，其实就是在调用构造方法时
* 格式：
* public 类名称(参数类型 参数名称){
*   方法体
* }
*
* 注意事项：
* 1、构造方法的名称必须和所在的类名称完全一样，就连大小写也完全一样
* 2、构造方法不要写返回值类型，连void都不写
* 3、构造方法不能return一个具体返回值
* 4、如果没有编写任何构造方法，编译器将会默认赠送一个构造方法，什么事情都不做
* public Student(){}
* 5、一旦编写了至少一个构造方法，那么编译器将不再赠送构造方法
* 6、构造方法也是可以重载的
*
* */
public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造方法执行！！！");
    }

    public Student(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("有参构造方法执行");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
