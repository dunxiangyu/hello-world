package cn.baoshun.demo02;

/*
* 定义一个类用来模拟手机事物
* 属性：品牌、颜色、价格
* 行为：打电话、发短信
*
* 对应到类当中
* 成员变量：
*   String brand;
*   double price;
*   String color;
* 成员方法:
*   pubilc void call(String who) {}
*   public void sendMessage() {}
* */
public class Phone {
    // 成员变量
    String brand;
    double price;
    String color;

    // 成员方法
    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }
}
