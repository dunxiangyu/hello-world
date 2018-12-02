package cn.baoshun.demo09;

/*
* super关键字来访问父类内容，this关键字来访问子类内容
*
* 1、本类的成员方法中，访问本类的成员变量
* 2、本类的成员方法中，访问本类的另一个成员方法
* 3、在本类的构造方法中，访问本类的另一个构造方法
* 在第三种用法当中要注意：
* this(....)也必须是第一个语句
* super()和this() 不能同时调用，
* */
public class Zi extends Fu {

    int num = 10;

    public Zi(){
        this(123);  //本类的无参构造，调用本类的有参构造
    }

    public Zi(int num) {

    }


    public void showNum() {
        int num = 20;
        System.out.println(num);    // 局部变量
        System.out.println(this.num);      //本类中的成员变量
        System.out.println(super.num);
    }

    public void methodA() {

        System.out.println("AAA");
    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }
}
